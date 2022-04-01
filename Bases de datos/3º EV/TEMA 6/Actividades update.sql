UPDATE EMPLE SET SALARIO=SALARIO+100,COMISION=COMISION+10
WHERE DEPT_NO=10


UPDATE EMPLE SET DEPT_NO = (
SELECT DEPT_NO 
FROM EMPLE 
WHERE UPPER(OFICIO)='EMPLEADO' 
GROUP BY DEPT_NO
HAVING COUNT(*) = (SELECT MAX(COUNT(*)) FROM EMPLE WHERE UPPER(OFICIO)='EMPLEADO' GROUP BY DEPT_NO))
WHERE UPPER(APELLIDO)='SAAVEDRA' 
