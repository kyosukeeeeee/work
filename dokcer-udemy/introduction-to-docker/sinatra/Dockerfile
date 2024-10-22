FROM ruby:2.7.6

COPY Gemfile .

RUN apt update
RUN apt install -y ruby-dev build-essential libmariadb-dev
RUN bundle install
