package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: fvb  reason: default package */
/* loaded from: classes.dex */
public final class fvb implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final long c;
    private final /* synthetic */ int d;
    private final fyb e;

    public fvb(Context context, GoogleHelp googleHelp, fyb fybVar, long j, int i, byte[] bArr) {
        this.d = i;
        this.a = context;
        this.b = googleHelp;
        this.e = fybVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        List<fun> list;
        if (this.d == 0) {
            try {
                fuu fuuVar = new fuu();
                fuuVar.c();
                singletonList = this.e.a();
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
                Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
                singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
            }
            fvl a = fuy.a(this.a);
            GoogleHelp googleHelp = this.b;
            Bundle f = giw.f(singletonList);
            long j = this.c;
            fod fodVar = a.h;
            fvd fvdVar = new fvd(fodVar, f, j, googleHelp);
            fodVar.a(fvdVar);
            fyb.aI(fvdVar);
            return;
        }
        Bundle bundle = new Bundle(1);
        try {
            fuu fuuVar2 = new fuu();
            fuuVar2.c();
            list = this.e.g();
            File cacheDir = this.a.getCacheDir();
            if (list != null && !list.isEmpty() && cacheDir != null) {
                for (fun funVar : list) {
                    funVar.e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(fuuVar2.a()));
        } catch (Exception e2) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e2);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            list = null;
        }
        ful a2 = ful.a(list);
        fvl a3 = fuy.a(this.a);
        GoogleHelp googleHelp2 = this.b;
        long j2 = this.c;
        fod fodVar2 = a3.h;
        fvf fvfVar = new fvf(fodVar2, a2, bundle, j2, googleHelp2);
        fodVar2.a(fvfVar);
        fyb.aI(fvfVar);
    }
}
