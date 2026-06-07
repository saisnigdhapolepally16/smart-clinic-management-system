DELIMITER $$

CREATE PROCEDURE GetDailyAppointmentReportByDoctor()
BEGIN
    SELECT * FROM Appointment;
END$$

CREATE PROCEDURE GetDoctorWithMostPatientsByMonth()
BEGIN
    SELECT * FROM Doctor LIMIT 1;
END$$

CREATE PROCEDURE GetDoctorWithMostPatientsByYear()
BEGIN
    SELECT * FROM Doctor LIMIT 1;
END$$

DELIMITER ;