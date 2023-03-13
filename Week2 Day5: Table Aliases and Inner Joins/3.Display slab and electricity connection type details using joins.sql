select ect.connection_name , s.from_unit , s.to_unit , s.rate 
from slab s inner join electricity_connection_type ect
on ect.id=s.connection_type_id 
order by rate asc;
