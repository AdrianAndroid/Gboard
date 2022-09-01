package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* renamed from: bct  reason: default package */
/* loaded from: classes.dex */
public final class bct implements bcv {
    private final /* synthetic */ int a;
    private final Object b;

    public bct(int i) {
        this.a = i;
        this.b = Bitmap.CompressFormat.JPEG;
    }

    public bct(Resources resources, int i) {
        this.a = i;
        ce.m(resources);
        this.b = resources;
    }

    @Override // defpackage.bcv
    public final axh a(axh axhVar, ava avaVar) {
        if (this.a == 0) {
            return bbn.f((Resources) this.b, axhVar);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) axhVar.c()).compress((Bitmap.CompressFormat) this.b, 100, byteArrayOutputStream);
        axhVar.e();
        return new bcc(byteArrayOutputStream.toByteArray(), 0);
    }
}
