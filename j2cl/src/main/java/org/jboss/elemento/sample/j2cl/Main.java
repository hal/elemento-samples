/*
 *  Copyright 2022 Red Hat
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.jboss.elemento.sample.j2cl;

import org.jboss.elemento.sample.common.ApplicationElement;
import org.jboss.elemento.sample.common.FooterElement;
import org.jboss.elemento.sample.common.TodoRepository;

import jsinterop.annotations.JsType;

import static elemental2.dom.DomGlobal.location;
import static elemental2.dom.DomGlobal.window;
import static org.jboss.elemento.Elements.body;
import static org.jboss.elemento.EventType.bind;
import static org.jboss.elemento.EventType.hashchange;

@JsType
@SuppressWarnings({ "unused", "ConfusingMainMethod" })
public class Main {

    public static void main() {
        ApplicationElement application = new ApplicationElement(new TodoRepository());

        body().add(application).add(new FooterElement());
        bind(window, hashchange, event -> application.filter(location.hash));
        application.filter(location.hash);
    }
}
