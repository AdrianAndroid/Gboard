package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

/* compiled from: PG */
/* renamed from: avx  reason: default package */
/* loaded from: classes.dex */
public final class avx implements avl {
    private final ParcelFileDescriptorRewinder$InternalRewinder a;

    public avx(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public static boolean d() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // defpackage.avl
    public final void b() {
    }

    @Override // defpackage.avl
    /* renamed from: c */
    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }
}
