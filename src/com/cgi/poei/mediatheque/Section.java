package com.cgi.poei.mediatheque;

public enum Section {
	
	TOUT_PUBLIC, JEUNESSE, ADULTE;
	
	public boolean isAssezAge(Usager usager) {
		if (this == ADULTE) {
			Integer age = usager.getAge();
			return age != null && age >= 18;
		}
		return true;
	}

	@Override
	public String toString() {
		switch (this) {
		case TOUT_PUBLIC:
			return "Tout public";
		case JEUNESSE:
			return "Jeunesse";
		case ADULTE:
			return "Adulte";
		}
		return null;
	}

}
