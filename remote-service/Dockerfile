FROM node:20


WORKDIR /remote-service

COPY . .

RUN npm ci

CMD [ "node", "src/app.js" ]

EXPOSE 3000
