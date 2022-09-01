package defpackage;

import java.lang.Character;

/* compiled from: PG */
/* renamed from: bti  reason: default package */
/* loaded from: classes.dex */
public final class bti {
    static final hhl a = hhq.f("max_chinese_context_length", 5);
    private final StringBuilder b = new StringBuilder();
    private boolean c = false;
    private int d = 1;

    private final void e() {
        this.c = true;
        int length = this.b.length();
        int i = length;
        int i2 = 1;
        while (i > 0) {
            int codePointBefore = this.b.codePointBefore(i);
            int charCount = Character.charCount(codePointBefore);
            Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointBefore);
            int i3 = 2;
            if (!Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS.equals(of) && !Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A.equals(of) && !Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B.equals(of)) {
                i3 = 3;
                if ((codePointBefore < 65 || codePointBefore > 90) && (codePointBefore < 97 || codePointBefore > 122)) {
                    i3 = 1;
                }
            }
            if ((i2 == 1 || i2 == i3) && i3 != 1) {
                if (length - i < (i3 + (-1) != 1 ? 20 : ((Long) a.c()).intValue())) {
                    if (i2 == 1) {
                        i2 = i3;
                    }
                    i -= charCount;
                }
            }
            this.b.delete(0, i);
            break;
        }
        this.d = i2;
    }

    public final String a() {
        if (!this.c) {
            e();
        }
        return this.b.toString();
    }

    public final void b(String str) {
        this.c = false;
        this.b.append(str);
    }

    public final void c() {
        this.b.setLength(0);
        this.c = false;
        this.d = 1;
    }

    public final boolean d() {
        if (!this.c) {
            e();
        }
        return this.d == 3;
    }
}
