package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: gou  reason: default package */
/* loaded from: classes.dex */
public final class gou {
    static final byte[] a = {0, 0};
    public static final /* synthetic */ int d = 0;
    public final bmp b;
    public boolean c;

    public gou(bmp bmpVar, String str) {
        this.b = bmpVar;
        final byte[] a2 = giy.a(str.replace("_", ""));
        bmpVar.g(a2.length + 2, new bmo() { // from class: gos
            @Override // defpackage.bmo
            public final void a(ByteBuffer byteBuffer) {
                byte[] bArr = a2;
                byteBuffer.put(gou.a);
                byteBuffer.put(bArr);
            }
        });
    }
}
