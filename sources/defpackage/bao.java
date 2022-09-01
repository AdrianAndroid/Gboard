package defpackage;

import android.graphics.ImageDecoder;

/* compiled from: PG */
/* renamed from: bao  reason: default package */
/* loaded from: classes.dex */
public final class bao implements avc {
    private final axp a = new axq();

    @Override // defpackage.avc
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ava avaVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    @Override // defpackage.avc
    /* renamed from: c */
    public final axh a(ImageDecoder.Source source, int i, int i2, ava avaVar) {
        return new bbn(ImageDecoder.decodeBitmap(source, new bai(i, i2, avaVar)), this.a, 1);
    }
}
