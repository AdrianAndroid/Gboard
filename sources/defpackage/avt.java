package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: avt  reason: default package */
/* loaded from: classes.dex */
public final class avt implements avk {
    private final axn a;

    public avt(axn axnVar) {
        this.a = axnVar;
    }

    @Override // defpackage.avk
    public final /* bridge */ /* synthetic */ avl a(Object obj) {
        return new avu((InputStream) obj, this.a);
    }

    @Override // defpackage.avk
    public final Class b() {
        return InputStream.class;
    }
}
