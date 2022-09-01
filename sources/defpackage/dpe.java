package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.JsonReader;
import android.util.SparseArray;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dpe  reason: default package */
/* loaded from: classes.dex */
public final class dpe {
    public static dpe a;
    public final Object b;

    public dpe(ctw ctwVar) {
        lls llsVar = new lls();
        for (ctx ctxVar : ctwVar.a) {
            llsVar.a(lmz.s(ctxVar.a, ctxVar.b), Float.valueOf(ctxVar.c));
        }
        this.b = llsVar.l();
    }

    public dpe(ihq ihqVar) {
        this.b = ihqVar;
    }

    public dpe(CharSequence charSequence) {
        this.b = charSequence;
    }

    public dpe(kcq kcqVar, byte[] bArr) {
        this.b = kcqVar;
    }

    private final List k() {
        return ((kcq) this.b).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return c() && exb.c() && ((Boolean) dpj.d.c()).booleanValue() && d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return c() && exb.c() && ((Boolean) dpj.a.c()).booleanValue() && d();
    }

    public final boolean c() {
        return ((ino) ((kcq) this.b).b).ak("pref_key_use_personalized_dicts");
    }

    public final boolean d() {
        return ((ino) ((kcq) this.b).b).aj(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
    }

    public final int e(iay iayVar) {
        Object obj = this.b;
        if (obj != null) {
            int i = iayVar.c;
            int[] iArr = (int[]) obj;
            if (i < iArr.length && i >= 0) {
                return iArr[i];
            }
            return -1;
        }
        return -1;
    }

    public final llp f(List list) {
        lls i = llw.i(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cxc cxcVar = (cxc) it.next();
            i.a(cxcVar.b, cxcVar);
        }
        llw l = i.l();
        llk e = llp.e();
        for (String str : k()) {
            cxc cxcVar2 = (cxc) l.get(str);
            if (cxcVar2 != null) {
                e.h(cxcVar2);
            }
        }
        return e.g();
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Set, java.lang.Object] */
    public final llp g(llp llpVar, int i, int i2) {
        ArrayList arrayList = new ArrayList(llpVar);
        arrayList.add(i2, (cxc) arrayList.remove(i));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(((cxc) arrayList.get(i3)).b);
        }
        Object obj = this.b;
        kcq kcqVar = (kcq) obj;
        synchronized (kcqVar.b) {
            if (!((knr) ((kcq) obj).b).a().equals(arrayList2)) {
                ((knr) ((kcq) obj).b).a().clear();
                ((knr) ((kcq) obj).b).a().addAll(arrayList2);
                ((knr) ((kcq) obj).b).b();
                for (knq knqVar : kcqVar.c) {
                    Object obj2 = kcqVar.a;
                    Objects.requireNonNull(knqVar);
                    ((Handler) obj2).post(new joq(knqVar, 18));
                }
            }
        }
        return llp.o(arrayList);
    }

    public final void h(cxc cxcVar, boolean z) {
        ((kcq) this.b).c(cxcVar.b, z, true);
    }

    public final boolean i(cxc cxcVar) {
        return k().contains(cxcVar.b);
    }

    public final float j(String str, Map map) {
        float f = 0.0f;
        for (Map.Entry entry : map.entrySet()) {
            Float f2 = (Float) ((llw) this.b).get(lmz.s(str, (String) entry.getKey()));
            f += (f2 != null ? f2.floatValue() : 0.0f) * ((Number) entry.getValue()).floatValue();
        }
        return f;
    }

    public dpe(JsonReader jsonReader, byte[] bArr) {
        this.b = new qo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            jav f = jav.f(jsonReader.nextName());
            ((qv) this.b).put(f, new dpe(jsonReader));
        }
        jsonReader.endObject();
    }

    public dpe(JsonReader jsonReader) {
        this.b = new SparseArray();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int parseInt = Integer.parseInt(jsonReader.nextName());
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(jsonReader.nextString());
            }
            jsonReader.endArray();
            ((SparseArray) this.b).put(parseInt, arrayList);
        }
        jsonReader.endObject();
    }

    public dpe(int[] iArr) {
        int i;
        if (iArr != null) {
            i = -1;
            for (int i2 : iArr) {
                if (i2 > i) {
                    i = i2;
                }
            }
        } else {
            i = -1;
        }
        if (i < 0) {
            this.b = null;
            return;
        }
        int[] iArr2 = new int[i + 1];
        this.b = iArr2;
        Arrays.fill(iArr2, -1);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 >= 0) {
                ((int[]) this.b)[i4] = i3;
            }
        }
    }

    public dpe(Context context) {
        this.b = new kcq(context, (byte[]) null);
    }
}
