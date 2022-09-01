package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bcb  reason: default package */
/* loaded from: classes.dex */
public final class bcb implements avl {
    private final ByteBuffer a;

    public bcb(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.avl
    public final /* bridge */ /* synthetic */ Object a() {
        this.a.position(0);
        return this.a;
    }

    @Override // defpackage.avl
    public final void b() {
    }
}
