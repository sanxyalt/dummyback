package com.democorp.dummy.services;

import com.democorp.dummy.controllers.DumbController;
import com.democorp.dummy.data.enums.EnumInterface;
import com.democorp.dummy.data.enums.api.EnumDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.stereotype.Service;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EnumServiceImpl implements EnumService {

    private static final Logger logger = LogManager.getLogger(EnumServiceImpl.class);

    private static final String ENUMS_FOLDER = "com.democorp.dummy.data.enums";

    @Override
    public Map<String, Set<EnumDto>> getAllEnumValues() {
        Map<String, Set<EnumDto>> enumMap = new HashMap<>();

        // Configure scanner to detect classes implementing EnumInterface
        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
        scanner.addIncludeFilter(new AssignableTypeFilter(EnumInterface.class));
        scanner.findCandidateComponents(ENUMS_FOLDER).forEach(beanDefinition -> {
            try {
                Class<?> clazz = Class.forName(beanDefinition.getBeanClassName());
                if (clazz.isEnum()) {
                    Set<EnumDto> enumValues = Arrays.stream(((Class<? extends EnumInterface>) clazz).getEnumConstants())
                            .map(EnumInterface::toDto)
                            .collect(Collectors.toSet());
                    enumMap.put(clazz.getSimpleName(), enumValues);
                }
            } catch (ClassNotFoundException e) {
                logger.error("Enum was not found error.", e);
            }
        });

        return enumMap;
    }

}
