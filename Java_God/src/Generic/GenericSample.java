package Generic;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
    }

    public void checkCastingDTO() {
        CastingDTO<String> dto1 = new CastingDTO<>();
        dto1.setObject(new String());

        CastingDTO<StringBuffer> dto2 = new CastingDTO<>();
        dto2.setObject(new StringBuffer());

        CastingDTO<StringBuilder> dto3 = new CastingDTO<>();
        dto3.setObject(new StringBuilder());

        String test1 = dto1.getObject();
        StringBuffer test2 = dto2.getObject();
        StringBuilder test3 = dto3.getObject();
    }
}
