package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: xl  reason: default package */
/* loaded from: classes2.dex */
public final class xl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Locale locale) {
        return locale.getScript();
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }
}
