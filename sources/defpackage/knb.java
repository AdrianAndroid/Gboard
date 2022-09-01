package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: knb  reason: default package */
/* loaded from: classes.dex */
public final class knb extends an implements agt {
    public ArrayAdapter a;
    public LicenseMenuActivity b;

    @Override // defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.f143310_resource_name_obfuscated_res_0x7f0e0453, viewGroup, false);
    }

    @Override // defpackage.an
    public final void R() {
        super.R();
        agu a = agu.a(B());
        if (a.b.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (agu.b(2)) {
            new StringBuilder("destroyLoader in ").append(a);
        }
        agv b = a.b.b();
        if (b == null) {
            return;
        }
        b.k();
        qw qwVar = a.b.b;
        int a2 = qx.a(qwVar.c, qwVar.e, 54321);
        if (a2 < 0) {
            return;
        }
        Object[] objArr = qwVar.d;
        Object obj = objArr[a2];
        Object obj2 = qw.a;
        if (obj == obj2) {
            return;
        }
        objArr[a2] = obj2;
        qwVar.b = true;
    }

    @Override // defpackage.an
    public final void V(View view, Bundle bundle) {
        ap B = B();
        this.a = new ArrayAdapter(B, (int) R.layout.f143280_resource_name_obfuscated_res_0x7f0e0450, (int) R.id.f65550_resource_name_obfuscated_res_0x7f0b0774, new ArrayList());
        agu a = agu.a(B);
        if (a.b.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        agv b = a.b.b();
        if (agu.b(2)) {
            new StringBuilder("initLoader in ").append(a);
        }
        if (b == null) {
            try {
                a.b.c = true;
                aha ahaVar = new aha(B());
                if (ahaVar.getClass().isMemberClass() && !Modifier.isStatic(ahaVar.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + ahaVar);
                }
                agv agvVar = new agv(ahaVar);
                if (agu.b(3)) {
                    new StringBuilder("  Created new loader ").append(agvVar);
                }
                a.b.b.h(54321, agvVar);
                a.b.a();
                agvVar.l(a.a, this);
            } catch (Throwable th) {
                a.b.a();
                throw th;
            }
        } else {
            if (agu.b(3)) {
                new StringBuilder("  Re-using existing loader ").append(b);
            }
            b.l(a.a, this);
        }
        ListView listView = (ListView) view.findViewById(R.id.f65580_resource_name_obfuscated_res_0x7f0b0777);
        listView.setAdapter((ListAdapter) this.a);
        listView.setOnItemClickListener(new kna(this, 0));
    }

    @Override // defpackage.an
    public final void fX(Context context) {
        super.fX(context);
        ap B = B();
        if (B instanceof LicenseMenuActivity) {
            this.b = (LicenseMenuActivity) B;
        }
    }

    @Override // defpackage.an
    public final void fY() {
        super.fY();
        this.b = null;
    }
}
