package com.hellobike.base.tunnel.filter;

import com.hellobike.base.tunnel.model.Event;
import com.hellobike.base.tunnel.model.EventType;

/*
 * Copyright 2018 Shanghai Junzheng Network Technology Co.,Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain CONFIG_NAME copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author machunxiao 2018-10-30
 */
public class EventTypeFilter implements IEventFilter {

    private final EventType eventType;

    public EventTypeFilter(EventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public boolean filter(Event event) {
        if (event == null) {
            return false;
        }
        return getEventType() == null || event.getEventType() == getEventType();
    }

    public EventType getEventType() {
        return eventType;
    }

}
