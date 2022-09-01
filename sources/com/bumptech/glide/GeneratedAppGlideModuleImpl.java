package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.inputmethod.latin.GlideLoaderModule;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    public GeneratedAppGlideModuleImpl(Context context) {
        long j = GlideLoaderModule.a;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final /* bridge */ /* synthetic */ bdn a() {
        return new bdm(1);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set b() {
        return Collections.emptySet();
    }

    @Override // defpackage.bed, defpackage.bee
    public final void c(Context context, atg atgVar) {
        ayl b = ayp.b();
        b.b = GlideLoaderModule.a;
        atgVar.g = b.a();
        ayl c = ayp.c();
        c.b = GlideLoaderModule.a;
        atgVar.e = c.a();
        ayl d = ayp.d();
        d.b = GlideLoaderModule.a;
        atgVar.d = d.a();
        ayi ayiVar = new ayi(context);
        float floatValue = ((Double) GlideLoaderModule.b.c()).floatValue();
        boolean z = true;
        if (floatValue >= 0.0f && floatValue <= 1.0f) {
            ce.n(floatValue >= 0.0f && floatValue <= 1.0f, "Size multiplier must be between 0 and 1");
            ayiVar.e = floatValue;
        }
        float floatValue2 = ((Double) GlideLoaderModule.c.c()).floatValue();
        if (floatValue2 >= 0.0f && floatValue2 <= 1.0f) {
            ce.n(floatValue2 >= 0.0f && floatValue2 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            ayiVar.f = floatValue2;
        }
        float floatValue3 = ((Double) GlideLoaderModule.e.c()).floatValue();
        if (floatValue3 >= 0.0f) {
            ce.n(floatValue3 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            ayiVar.c = floatValue3;
        }
        float floatValue4 = ((Double) GlideLoaderModule.d.c()).floatValue();
        if (floatValue4 >= 0.0f) {
            if (floatValue4 < 0.0f) {
                z = false;
            }
            ce.n(z, "Bitmap pool screens must be greater than or equal to 0");
            ayiVar.d = floatValue4;
        }
        int intValue = ((Long) GlideLoaderModule.f.c()).intValue();
        if (intValue >= 0) {
            ayiVar.g = intValue;
        }
        lcv a = ayiVar.a();
        atgVar.l = a;
        atgVar.b = hjq.e(a);
    }

    @Override // defpackage.bed
    public final boolean d() {
        return false;
    }

    @Override // defpackage.beg, defpackage.bei
    public final void e(Context context, bmf bmfVar) {
        bmfVar.j(Uri.class, ByteBuffer.class, new cvz(context));
        bmfVar.j(Uri.class, ByteBuffer.class, new cwg(context));
        bmfVar.n(aze.class, InputStream.class, new bab(4));
        bmfVar.n(aze.class, ByteBuffer.class, new bab(3));
        bmfVar.j(hjo.class, ByteBuffer.class, new bab(5));
    }
}
