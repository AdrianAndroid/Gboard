package com.google.android.apps.inputmethod.latin;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GlideLoaderModule extends bed {
    public static final long a = TimeUnit.MINUTES.toMillis(2);
    public static final hhl b = hhq.e("glide_max_cache_size_multiplier", -1.0d);
    public static final hhl c = hhq.e("glide_max_cache_size_multiplier_low_memory", -1.0d);
    public static final hhl d = hhq.e("glide_bitmap_pool_screens", -1.0d);
    public static final hhl e = hhq.e("glide_memory_cache_screens", -1.0d);
    public static final hhl f = hhq.f("glide_array_pool_size_bytes", -1);

    static {
        lug.i("GboardGlide");
    }
}
