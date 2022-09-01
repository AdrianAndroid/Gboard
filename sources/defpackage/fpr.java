package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: fpr  reason: default package */
/* loaded from: classes.dex */
public final class fpr extends Fragment implements fpq {
    public static final WeakHashMap a = new WeakHashMap();
    public Bundle c;
    private final Map d = DesugarCollections.synchronizedMap(new qo());
    public int b = 0;

    @Override // defpackage.fpq
    public final Activity a() {
        return getActivity();
    }

    @Override // defpackage.fpq
    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.d.get(str));
    }

    @Override // defpackage.fpq
    public final void c(String str, LifecycleCallback lifecycleCallback) {
        if (!this.d.containsKey(str)) {
            this.d.put(str, lifecycleCallback);
            if (this.b <= 0) {
                return;
            }
            new gco(Looper.getMainLooper()).post(new epv(this, lifecycleCallback, str, 8));
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.c(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.b = 5;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.b = 3;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.d.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.b = 2;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.i();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.b = 4;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.j();
        }
    }
}
