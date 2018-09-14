SELECT area_id,area_name,priority,create_time,last_edit_time
FROM tb_area
WHERE
area_id=#{areaId}