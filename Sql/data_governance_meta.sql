create table if not exists data_governance_meta(
governance_identifier varchar(255) not null,
source varchar(255) null,
components varchar(255) null,
meta_datas varchar(255) null,
lineage_flow char null,
data_loss_risk_identfier Integer null,
review_required char null,
conflict_avoidance varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint data_governance_meta_pk primary key(governance_identifier));