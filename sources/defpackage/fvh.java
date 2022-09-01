package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: fvh  reason: default package */
/* loaded from: classes.dex */
final class fvh extends fvn {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ fvj c;
    final /* synthetic */ fyb d;

    public fvh(Intent intent, WeakReference weakReference, fvj fvjVar, fyb fybVar, byte[] bArr) {
        this.a = intent;
        this.b = weakReference;
        this.c = fvjVar;
        this.d = fybVar;
    }

    @Override // defpackage.fvn
    public final void d(GoogleHelp googleHelp) {
        ViewGroup viewGroup;
        long nanoTime = System.nanoTime();
        this.a.putExtra("EXTRA_START_TICK", nanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            this.c.i(fvk.a);
            return;
        }
        if (this.d != null) {
            Context applicationContext = activity.getApplicationContext();
            fyb fybVar = this.d;
            if (fybVar != null) {
                googleHelp.B = true;
                giw.e(new fvb(applicationContext, googleHelp, fybVar, nanoTime, 1, null));
                giw.e(new fvb(applicationContext, googleHelp, fybVar, nanoTime, 0, null));
            }
        }
        googleHelp.z = fmx.b;
        TogglingData togglingData = googleHelp.w;
        if (togglingData != null) {
            String obj = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        obj = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            togglingData.c = obj;
        }
        fvj fvjVar = this.c;
        Intent intent = this.a;
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            fuz fuzVar = (fuz) fyb.B(intent, "EXTRA_IN_PRODUCT_HELP", fuz.CREATOR);
            fuzVar.a = googleHelp;
            Parcel obtain = Parcel.obtain();
            fuo.b(fuzVar, obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", marshall);
        }
        new gco(Looper.getMainLooper()).post(new fso(activity, intent, 3));
        fvjVar.k(Status.a);
    }
}
