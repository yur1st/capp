CREATE TABLE Device (Device_id SERIAL NOT NULL, Device_name varchar(255) NOT NULL UNIQUE, TravellerRoute_ID int4 NOT NULL, CONSTRAINT id PRIMARY KEY (Device_id));
CREATE TABLE Route (Route_ID SERIAL NOT NULL, Route_name varchar(255) NOT NULL, RouteType_id int4 NOT NULL, StandartRoute_id int4 NOT NULL, Workplace_id int4 NOT NULL, PRIMARY KEY (Route_ID));
CREATE TABLE Workplace (Workplace_id SERIAL NOT NULL, Workplace_name varchar(255) NOT NULL, PRIMARY KEY (Workplace_id));
CREATE TABLE StandartRroute (StandartRoute_id SERIAL NOT NULL, StandartRoute_name varchar(255) NOT NULL UNIQUE, StandartRoute_sequence int4 NOT NULL, StandartOperation_id int4 NOT NULL, PRIMARY KEY (StandartRoute_id));
CREATE TABLE AttributeLimitRange (AttributeLimitRange_id SERIAL NOT NULL, AttributLimitRange_min float4 NOT NULL, AttributLimitRange_max float4 NOT NULL, PRIMARY KEY (AttributeLimitRange_id));
CREATE TABLE Operation (Operation_id SERIAL NOT NULL, Operation_CT float4, Operation_AttributeMap varchar(65536) NOT NULL, StandartOperation_id int4 NOT NULL, PRIMARY KEY (Operation_id));
CREATE TABLE StandartOperation (StandartOperation_id SERIAL NOT NULL, StandartOperation_name varchar(255) NOT NULL, AttributeSet_id int4 NOT NULL, PRIMARY KEY (StandartOperation_id));
CREATE TABLE AttributeSet (AttributeSet_id SERIAL NOT NULL, AttributeSet_Keys varchar(65536) NOT NULL UNIQUE, PRIMARY KEY (AttributeSet_id));
CREATE TABLE RouteStatus (RouteStatus_id SERIAL NOT NULL, RouteType_name varchar(255) NOT NULL, PRIMARY KEY (RouteStatus_id));
CREATE TABLE AttributeLimitSet (AttributeLimitSet_id SERIAL NOT NULL, AtributeLimitSet_set varchar(255) NOT NULL, PRIMARY KEY (AttributeLimitSet_id));
CREATE TABLE AttributeType (AttributeType_id SERIAL NOT NULL, AttributType_name varchar(255) NOT NULL, PRIMARY KEY (AttributeType_id));
CREATE TABLE Attribute (Attribute_id SERIAL NOT NULL, Attribute_name varchar(255) NOT NULL, Attribute_isInfluenceCT bool NOT NULL, AttributeLimitSet_id int4 NOT NULL, AttributeLimitRange_id int4 NOT NULL, AttributeType_id int4 NOT NULL, Unit_id int4 NOT NULL, PRIMARY KEY (Attribute_id));
CREATE TABLE Unit (Unit_id SERIAL NOT NULL, Unit_name varchar(255), Unit_units varchar(255), PRIMARY KEY (Unit_id));
CREATE TABLE Operation_Route (OperationOperation_id int4 NOT NULL, RouteRoute_ID int4 NOT NULL, PRIMARY KEY (OperationOperation_id, RouteRoute_ID));
ALTER TABLE Route ADD CONSTRAINT FK_RouteId_RouteStatusId FOREIGN KEY (RouteType_id) REFERENCES RouteStatus (RouteStatus_id);
ALTER TABLE Route ADD CONSTRAINT FK_RouteId_StandartRouteId FOREIGN KEY (StandartRoute_id) REFERENCES StandartRroute (StandartRoute_id);
ALTER TABLE Route ADD CONSTRAINT FKRoute715001 FOREIGN KEY (Workplace_id) REFERENCES Workplace (Workplace_id);
ALTER TABLE StandartRroute ADD CONSTRAINT FKStandartRr602992 FOREIGN KEY (StandartOperation_id) REFERENCES StandartOperation (StandartOperation_id);
ALTER TABLE StandartOperation ADD CONSTRAINT FKStandartOp131375 FOREIGN KEY (AttributeSet_id) REFERENCES AttributeSet (AttributeSet_id);
ALTER TABLE Operation ADD CONSTRAINT FKOperation445312 FOREIGN KEY (StandartOperation_id) REFERENCES StandartOperation (StandartOperation_id);
ALTER TABLE Device ADD CONSTRAINT FKDevice265897 FOREIGN KEY (TravellerRoute_ID) REFERENCES Route (Route_ID);
ALTER TABLE Attribute ADD CONSTRAINT FKAttribute129513 FOREIGN KEY (AttributeLimitSet_id) REFERENCES AttributeLimitSet (AttributeLimitSet_id);
ALTER TABLE Attribute ADD CONSTRAINT FKAttribute476832 FOREIGN KEY (AttributeLimitRange_id) REFERENCES AttributeLimitRange (AttributeLimitRange_id);
ALTER TABLE Attribute ADD CONSTRAINT FKAttribute390772 FOREIGN KEY (AttributeType_id) REFERENCES AttributeType (AttributeType_id);
ALTER TABLE Attribute ADD CONSTRAINT FKAttribute984364 FOREIGN KEY (Unit_id) REFERENCES Unit (Unit_id);
ALTER TABLE Operation_Route ADD CONSTRAINT FKOperation_736207 FOREIGN KEY (OperationOperation_id) REFERENCES Operation (Operation_id);
ALTER TABLE Operation_Route ADD CONSTRAINT FKOperation_497865 FOREIGN KEY (RouteRoute_ID) REFERENCES Route (Route_ID);
