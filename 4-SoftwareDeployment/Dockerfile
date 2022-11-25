FROM postgres
LABEL description="Docker Image for PostgreSQL"
LABEL mainteiner="Tomchuk Viktoriia "
LABEL version="1.0"

ENV POSTGRES_USER tomchuk
ENV POSTGRES_PASSWORD qwerty123
ENV POSTGRES_DATABASE tomchukdb

COPY ./scripts/db_script.sql /docker-entrypoint-initdb.d/

