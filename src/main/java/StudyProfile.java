public enum StudyProfile {
    PEDAGOGY("Педагогика"),
    MEDICINE("Медицина"),
    THEATRE("Театральное искусство"),
    ECONIMICS("Экономика"),
    JURISPRUDENCE("Юриспруденция"),
    MUSIC("Музыка"),
    MATH("Математика"),
    PHYSICS("Физика"),
    JOURNALISM("Жураналистика"),
    MANAGEMENT("Управленчество"),
    IT("Информационные технологии"),
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
