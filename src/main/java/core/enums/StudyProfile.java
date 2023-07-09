package core.enums;

public enum StudyProfile {
    PEDAGOGY("Педагогика"),
    MEDICINE("Медицина"),
    THEATRE("Театральное искусство"),
    ECONIMICS("Экономика"),
    JURISPRUDENCE("Юриспруденция"),
    MUSIC("Музыка"),
    MATHEMATICS("Математика"),
    PHYSICS("Физика"),
    JOURNALISM("Жураналистика"),
    MANAGEMENT("Управленчество"),
    IT("Информационные технологии"),
    LINGUISTICS("Лингвистика"),
    MULTIDISCIPLINARY("Многопрофильный");

    private String profileName;

    StudyProfile(String profileName){
        this.profileName = profileName;
    }

    StudyProfile(){

    }

    @Override
    public String toString() {
        return profileName;
    }
}
