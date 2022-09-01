package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kkc  reason: default package */
/* loaded from: classes.dex */
public final class kkc {
    public final boolean a;

    public kkc(kkd kkdVar) {
        jdg.Q(kkdVar, "BuildInfo must be non-null");
        kkdVar.a();
        this.a = false;
    }

    public kkc(boolean z) {
        this.a = z;
    }

    public static kkc b() {
        return new kkc(false);
    }

    public static kkc c() {
        return new kkc(true);
    }

    public final boolean a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        return this.a;
    }
}
