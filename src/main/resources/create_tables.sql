CREATE TABLE public.breed (
	breed varchar NOT NULL,
	country varchar NULL,
	origin varchar NULL,
	coat varchar NULL,
	pattern varchar NULL,
	id uuid NOT NULL,
	CONSTRAINT breed_pk PRIMARY KEY (id)
	CONSTRAINT breed_un UNIQUE (breed)
);
CREATE TABLE public.cat (
	"name" varchar NULL,
	age float4 NULL,
	breed_id uuid NULL,
	id uuid NULL,
	CONSTRAINT cat_pk PRIMARY KEY (id),
	CONSTRAINT cat_fk FOREIGN KEY (id) REFERENCES public.breed(id)
);
