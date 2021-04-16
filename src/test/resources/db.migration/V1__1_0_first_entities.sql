create table IF NOT EXISTS users (
                         user_id serial PRIMARY KEY,
                         name varchar(50) NOT NULL,
                         login varchar(50) NOT NULL,
                         password text NOT NULL
);

create table IF NOT EXISTS calendars (
                             calendar_id serial PRIMARY KEY,
                             user_id serial REFERENCES "users" (user_id),
                             name varchar(100) NOT NULL
);

create table IF NOT EXISTS events (
                          event_id serial PRIMARY KEY,
                          calendar_id serial REFERENCES "calendars" (calendar_id),
                          period_start timestamp with time zone,
                          period_end timestamp with time zone
);