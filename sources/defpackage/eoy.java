package defpackage;

/* compiled from: PG */
/* renamed from: eoy  reason: default package */
/* loaded from: classes.dex */
public final class eoy implements dcv {
    private final StringBuilder a = new StringBuilder();

    @Override // defpackage.dcv
    public final String a(String str) {
        this.a.setLength(0);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            int indexOf = "hspnz".indexOf(str.charAt(i));
            this.a.append(indexOf >= 0 ? "一丨丿丶乛".charAt(indexOf) : str.charAt(i));
        }
        return this.a.toString();
    }
}
