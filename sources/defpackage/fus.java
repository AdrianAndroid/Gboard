package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: fus  reason: default package */
/* loaded from: classes.dex */
public final class fus implements Runnable {
    private final Context a;
    private final long b;
    private final /* synthetic */ int c;
    private final fyb d;

    public fus(Context context, fyb fybVar, long j, int i, byte[] bArr) {
        this.c = i;
        this.a = context;
        this.d = fybVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        List<fun> list;
        if (this.c == 0) {
            try {
                fuu fuuVar = new fuu();
                fuuVar.c();
                singletonList = this.d.a();
                if (singletonList == null) {
                    singletonList = new ArrayList(1);
                }
                try {
                    singletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(fuuVar.a())));
                } catch (UnsupportedOperationException unused) {
                    ArrayList arrayList = new ArrayList(singletonList);
                    arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(fuuVar.a())));
                    singletonList = arrayList;
                }
            } catch (Exception e) {
                Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
                singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
            }
            fnz a = fui.a(this.a);
            Bundle f = giw.f(singletonList);
            long j = this.b;
            fod fodVar = a.h;
            fuf fufVar = new fuf(fodVar, f, j);
            fodVar.a(fufVar);
            fyb.aI(fufVar);
            return;
        }
        Bundle bundle = new Bundle(1);
        try {
            fuu fuuVar2 = new fuu();
            fuuVar2.c();
            list = this.d.g();
            File cacheDir = this.a.getCacheDir();
            if (list != null && !list.isEmpty() && cacheDir != null) {
                for (fun funVar : list) {
                    funVar.e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(fuuVar2.a()));
        } catch (Exception e2) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e2);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            list = null;
        }
        long j2 = this.b;
        ful a2 = ful.a(list);
        fod fodVar2 = fui.a(this.a).h;
        fug fugVar = new fug(fodVar2, a2, bundle, j2);
        fodVar2.a(fugVar);
        fyb.aI(fugVar);
    }
}
