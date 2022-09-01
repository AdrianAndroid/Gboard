package defpackage;

/* compiled from: PG */
/* renamed from: hnc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hnc implements hne {
    private final /* synthetic */ int d;
    public static final /* synthetic */ hnc c = new hnc(2);
    public static final /* synthetic */ hnc b = new hnc(1);
    public static final /* synthetic */ hnc a = new hnc(0);

    private /* synthetic */ hnc(int i) {
        this.d = i;
    }

    @Override // defpackage.hne
    public final boolean a(String str, String str2) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return dsl.i(str2) && dsl.h(str);
            }
            int i2 = 0;
            while (true) {
                if (i2 >= str2.length()) {
                    break;
                } else if (Character.isWhitespace(str2.codePointAt(i2))) {
                    i2++;
                } else if (dsl.h(str)) {
                    return true;
                }
            }
            return false;
        }
        return dsl.i(str2);
    }
}
