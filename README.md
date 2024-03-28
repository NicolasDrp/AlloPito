# AlloPito


SELECT patient.lastname_patient,patient.firstname_patient FROM allopito.patient inner join bed on patient.id_patient =bed.id_bed inner join room on bed.id_room = room.id_room where id_service in(select id_service from service where name_service = "Urgences");

SELECT patient.lastname_patient,patient.firstname_patient FROM allopito.patient inner join bed on patient.id_patient =bed.id_bed inner join room on bed.id_room = room.id_room inner join service on room.id_service =service.id_service where name_service = "Urgences";



SELECT * FROM allopito.bed WHERE id_patient IS NULL;