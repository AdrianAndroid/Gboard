package defpackage;

import android.content.ContentResolver;

/* compiled from: PG */
/* renamed from: gfr  reason: default package */
/* loaded from: classes.dex */
public final class gfr extends gfs {
    public gfr(Integer num) {
        super("gms:feedback_client:feedback_options_max_data_size", num);
    }

    @Override // defpackage.gfs
    public final /* synthetic */ Object a() {
        int i;
        ContentResolver contentResolver = gfs.a;
        String str = this.b;
        int intValue = ((Integer) this.c).intValue();
        Object b = gfp.b(contentResolver);
        Integer num = (Integer) gfp.a(gfp.h, str, Integer.valueOf(intValue));
        if (num != null) {
            i = num.intValue();
        } else {
            String d = gfp.d(contentResolver, str);
            if (d != null) {
                try {
                    int parseInt = Integer.parseInt(d);
                    num = Integer.valueOf(parseInt);
                    intValue = parseInt;
                } catch (NumberFormatException unused) {
                }
            }
            gfp.c(b, gfp.h, str, num);
            i = intValue;
        }
        return Integer.valueOf(i);
    }
}
