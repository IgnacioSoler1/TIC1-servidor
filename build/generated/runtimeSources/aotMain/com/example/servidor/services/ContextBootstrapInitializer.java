package com.example.servidor.services;

import com.example.servidor.repositories.UsuarioRepository;
import org.springframework.aot.beans.factory.BeanDefinitionRegistrar;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public final class ContextBootstrapInitializer {
  public static void registerUsuarioService(DefaultListableBeanFactory beanFactory) {
    BeanDefinitionRegistrar.of("usuarioService", UsuarioService.class)
        .instanceSupplier((instanceContext) -> {
          UsuarioService bean = new UsuarioService();
          instanceContext.field("usuarioRepository", UsuarioRepository.class)
              .invoke(beanFactory, (attributes) -> bean.usuarioRepository = attributes.get(0));
                  return bean;
                }).register(beanFactory);
          }
        }
