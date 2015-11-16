/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.outlook;





/**
 * The type User.
*/
public class User extends DirectoryObject {

    public User(){
        setODataType("#Microsoft.OutlookServices.User");
    }
            
    private String EmailAddress;
     
    /**
    * Gets the Email Address.
    *
    * @return the String
    */
    public String getEmailAddress() {
        return this.EmailAddress; 
    }

    /**
    * Sets the Email Address.
    *
    * @param value the String
    */
    public void setEmailAddress(String value) { 
        this.EmailAddress = value; 
        valueChanged("EmailAddress", value);

    }
            
    private String DisplayName;
     
    /**
    * Gets the Display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.DisplayName; 
    }

    /**
    * Sets the Display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.DisplayName = value; 
        valueChanged("DisplayName", value);

    }
            
    private String Alias;
     
    /**
    * Gets the Alias.
    *
    * @return the String
    */
    public String getAlias() {
        return this.Alias; 
    }

    /**
    * Sets the Alias.
    *
    * @param value the String
    */
    public void setAlias(String value) { 
        this.Alias = value; 
        valueChanged("Alias", value);

    }
            
    private java.util.UUID MailboxGuid;
     
    /**
    * Gets the Mailbox Guid.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getMailboxGuid() {
        return this.MailboxGuid; 
    }

    /**
    * Sets the Mailbox Guid.
    *
    * @param value the java.util.UUID
    */
    public void setMailboxGuid(java.util.UUID value) { 
        this.MailboxGuid = value; 
        valueChanged("MailboxGuid", value);

    }
    
        
    private java.util.List<Subscription> Subscriptions = null;
    
    
     
    /**
    * Gets the Subscriptions.
    *
    * @return the java.util.List<Subscription>
    */
    public java.util.List<Subscription> getSubscriptions() {
        return this.Subscriptions; 
    }

    /**
    * Sets the Subscriptions.
    *
    * @param value the java.util.List<Subscription>
    */
    public void setSubscriptions(java.util.List<Subscription> value) { 
        this.Subscriptions = value; 
        valueChanged("Subscriptions", value);

    }
    
        
    private java.util.List<Message> Messages = null;
    
    
     
    /**
    * Gets the Messages.
    *
    * @return the java.util.List<Message>
    */
    public java.util.List<Message> getMessages() {
        return this.Messages; 
    }

    /**
    * Sets the Messages.
    *
    * @param value the java.util.List<Message>
    */
    public void setMessages(java.util.List<Message> value) { 
        this.Messages = value; 
        valueChanged("Messages", value);

    }
    
        
    private java.util.List<Group> JoinedGroups = null;
    
    
     
    /**
    * Gets the Joined Groups.
    *
    * @return the java.util.List<Group>
    */
    public java.util.List<Group> getJoinedGroups() {
        return this.JoinedGroups; 
    }

    /**
    * Sets the Joined Groups.
    *
    * @param value the java.util.List<Group>
    */
    public void setJoinedGroups(java.util.List<Group> value) { 
        this.JoinedGroups = value; 
        valueChanged("JoinedGroups", value);

    }
    
        
    private java.util.List<MailFolder> MailFolders = null;
    
    
     
    /**
    * Gets the Mail Folders.
    *
    * @return the java.util.List<MailFolder>
    */
    public java.util.List<MailFolder> getMailFolders() {
        return this.MailFolders; 
    }

    /**
    * Sets the Mail Folders.
    *
    * @param value the java.util.List<MailFolder>
    */
    public void setMailFolders(java.util.List<MailFolder> value) { 
        this.MailFolders = value; 
        valueChanged("MailFolders", value);

    }
            
    private Calendar Calendar;
     
    /**
    * Gets the Calendar.
    *
    * @return the Calendar
    */
    public Calendar getCalendar() {
        return this.Calendar; 
    }

    /**
    * Sets the Calendar.
    *
    * @param value the Calendar
    */
    public void setCalendar(Calendar value) { 
        this.Calendar = value; 
        valueChanged("Calendar", value);

    }
    
        
    private java.util.List<Calendar> Calendars = null;
    
    
     
    /**
    * Gets the Calendars.
    *
    * @return the java.util.List<Calendar>
    */
    public java.util.List<Calendar> getCalendars() {
        return this.Calendars; 
    }

    /**
    * Sets the Calendars.
    *
    * @param value the java.util.List<Calendar>
    */
    public void setCalendars(java.util.List<Calendar> value) { 
        this.Calendars = value; 
        valueChanged("Calendars", value);

    }
    
        
    private java.util.List<CalendarGroup> CalendarGroups = null;
    
    
     
    /**
    * Gets the Calendar Groups.
    *
    * @return the java.util.List<CalendarGroup>
    */
    public java.util.List<CalendarGroup> getCalendarGroups() {
        return this.CalendarGroups; 
    }

    /**
    * Sets the Calendar Groups.
    *
    * @param value the java.util.List<CalendarGroup>
    */
    public void setCalendarGroups(java.util.List<CalendarGroup> value) { 
        this.CalendarGroups = value; 
        valueChanged("CalendarGroups", value);

    }
    
        
    private java.util.List<Event> CalendarView = null;
    
    
     
    /**
    * Gets the Calendar View.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getCalendarView() {
        return this.CalendarView; 
    }

    /**
    * Sets the Calendar View.
    *
    * @param value the java.util.List<Event>
    */
    public void setCalendarView(java.util.List<Event> value) { 
        this.CalendarView = value; 
        valueChanged("CalendarView", value);

    }
    
        
    private java.util.List<Event> Events = null;
    
    
     
    /**
    * Gets the Events.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getEvents() {
        return this.Events; 
    }

    /**
    * Sets the Events.
    *
    * @param value the java.util.List<Event>
    */
    public void setEvents(java.util.List<Event> value) { 
        this.Events = value; 
        valueChanged("Events", value);

    }
    
        
    private java.util.List<Contact> Contacts = null;
    
    
     
    /**
    * Gets the Contacts.
    *
    * @return the java.util.List<Contact>
    */
    public java.util.List<Contact> getContacts() {
        return this.Contacts; 
    }

    /**
    * Sets the Contacts.
    *
    * @param value the java.util.List<Contact>
    */
    public void setContacts(java.util.List<Contact> value) { 
        this.Contacts = value; 
        valueChanged("Contacts", value);

    }
    
        
    private java.util.List<ContactFolder> ContactFolders = null;
    
    
     
    /**
    * Gets the Contact Folders.
    *
    * @return the java.util.List<ContactFolder>
    */
    public java.util.List<ContactFolder> getContactFolders() {
        return this.ContactFolders; 
    }

    /**
    * Sets the Contact Folders.
    *
    * @param value the java.util.List<ContactFolder>
    */
    public void setContactFolders(java.util.List<ContactFolder> value) { 
        this.ContactFolders = value; 
        valueChanged("ContactFolders", value);

    }
            
    private Photo Photo;
     
    /**
    * Gets the Photo.
    *
    * @return the Photo
    */
    public Photo getPhoto() {
        return this.Photo; 
    }

    /**
    * Sets the Photo.
    *
    * @param value the Photo
    */
    public void setPhoto(Photo value) { 
        this.Photo = value; 
        valueChanged("Photo", value);

    }
}
