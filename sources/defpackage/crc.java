package defpackage;

import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: crc  reason: default package */
/* loaded from: classes.dex */
public final class crc {
    public final cqp a;
    public final int b;
    public final EditorInfo c;
    public final mcb d;
    public final lfb e;
    public final lfb f;
    private final boolean g;
    private final lfb h;
    private final lfb i;
    private final lfb j;
    private final lfb k;

    public crc() {
    }

    public crc(cqp cqpVar, int i, EditorInfo editorInfo, boolean z, mcb mcbVar, lfb lfbVar, lfb lfbVar2, lfb lfbVar3, lfb lfbVar4, lfb lfbVar5, lfb lfbVar6) {
        this.a = cqpVar;
        this.b = i;
        this.c = editorInfo;
        this.g = z;
        this.d = mcbVar;
        this.h = lfbVar;
        this.e = lfbVar2;
        this.f = lfbVar3;
        this.i = lfbVar4;
        this.j = lfbVar5;
        this.k = lfbVar6;
    }

    public static crb a() {
        crb crbVar = new crb(null);
        crbVar.e(0);
        crbVar.b(false);
        return crbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mbs b() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crc.b():mbs");
    }

    public final boolean c() {
        mcb mcbVar = this.d;
        mcb mcbVar2 = mcb.KEYBOARD_IMAGE_INSERT_RESULT_UNKNOWN;
        int ordinal = mcbVar.ordinal();
        return ordinal == 2 || ordinal == 3 || ordinal == 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crc) {
            crc crcVar = (crc) obj;
            if (this.a.equals(crcVar.a) && this.b == crcVar.b && this.c.equals(crcVar.c) && this.g == crcVar.g && this.d.equals(crcVar.d) && this.h.equals(crcVar.h) && this.e.equals(crcVar.e) && this.f.equals(crcVar.f) && this.i.equals(crcVar.i) && this.j.equals(crcVar.j) && this.k.equals(crcVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        boolean z = this.g;
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        return "ImageShareResponse{image=" + valueOf + ", position=" + i + ", editorInfo=" + valueOf2 + ", incognito=" + z + ", insertResult=" + valueOf3 + ", localFile=" + valueOf4 + ", shareableUri=" + valueOf5 + ", mimeType=" + valueOf6 + ", concept=" + valueOf7 + ", keyword=" + valueOf8 + ", emoji=" + valueOf9 + "}";
    }
}
