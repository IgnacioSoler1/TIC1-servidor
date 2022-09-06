package com.example.servidor.Controllers;

import com.example.servidor.services.UsuarioService;
import org.springframework.aot.beans.factory.BeanDefinitionRegistrar;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public final class ContextBootstrapInitializer {
  public static void registerUsuarioController(DefaultListableBeanFactory beanFactory) {
    BeanDefinitionRegistrar.of("usuarioController", UsuarioController.class)
        .instanceSupplier((instanceContext) -> {
          UsuarioController bean = new UsuarioController();
          instanceContext.field("usuarioService", UsuarioService.class)
              .invoke(beanFactory, (attributes) -> bean.usuarioService = attributes.get(0));
                  return bean;
                }).register(beanFactory);
          }
        }
