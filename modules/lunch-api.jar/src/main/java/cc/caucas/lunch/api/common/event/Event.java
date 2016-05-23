package cc.caucas.lunch.api.common.event;

import cc.caucas.lunch.api.vaadin.common.ViewDetails;

/**
 * @author Georgy Davityan.
 */
public abstract class Event {

    public static final class UserLogoutEvent {}

    public static final class PostViewChangeEvent {

        private ViewDetails view;

        public PostViewChangeEvent(ViewDetails view) {
            this.view = view;
        }

        public ViewDetails getView() {
            return view;
        }
    }

}