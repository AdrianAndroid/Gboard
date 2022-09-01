package defpackage;

import android.content.Context;
import android.util.Printer;
import android.util.SparseArray;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dbv  reason: default package */
/* loaded from: classes.dex */
public final class dbv implements dbx {
    private static final hhl c = hhq.a("enable_auto_submit_fake_app_completion", false);
    public boolean a;
    public String b;
    private dbt e;
    private String f;
    private List g;
    private final Calendar d = new GregorianCalendar();
    private final hqi h = new dbu(this);
    private final opu i = new opu(this);

    public final void c(hpy hpyVar) {
        ArrayList arrayList;
        dpe dpeVar;
        hsk b = hsx.b();
        jav c2 = hqp.c();
        String str = this.f;
        if (b == null || hpyVar == null || this.e == null || c2 == null || str == null) {
            return;
        }
        if (hpyVar.g()) {
            dbt dbtVar = this.e;
            this.d.setTimeInMillis(System.currentTimeMillis());
            int i = this.d.get(11);
            int i2 = 0;
            while (true) {
                if (i2 >= dbtVar.d.size()) {
                    arrayList = null;
                    break;
                } else if (((iqe) dbtVar.d.get(i2)).j(str)) {
                    dpe dpeVar2 = (dpe) dbtVar.e.get(i2);
                    jav j = c2.j(((qo) dpeVar2.b).keySet());
                    if (j == null || (dpeVar = (dpe) ((qv) dpeVar2.b).get(j)) == null || ((SparseArray) dpeVar.b).size() == 0) {
                        arrayList = null;
                    } else {
                        arrayList = (List) ((SparseArray) dpeVar.b).valueAt(0);
                        for (int i3 = 1; i3 < ((SparseArray) dpeVar.b).size() && i >= ((SparseArray) dpeVar.b).keyAt(i3); i3++) {
                            arrayList = (List) ((SparseArray) dpeVar.b).valueAt(i3);
                        }
                    }
                    if (((Boolean) dbt.a.c()).booleanValue() && arrayList != null && arrayList.size() >= 10) {
                        int size = ((dbtVar.c / 2) * 3) % arrayList.size();
                        dbtVar.c++;
                        if (size != 0) {
                            ArrayList arrayList2 = new ArrayList(arrayList.size());
                            arrayList2.addAll(arrayList.subList(size, arrayList.size()));
                            arrayList2.addAll(arrayList.subList(0, size));
                            arrayList = arrayList2;
                        }
                    }
                } else {
                    i2++;
                }
            }
            if (jdg.W(arrayList, this.g)) {
                return;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                this.g = null;
                b.onDisplayCompletions(null);
                b.bS(null);
                return;
            }
            this.g = arrayList;
            int size2 = arrayList.size();
            CompletionInfo[] completionInfoArr = new CompletionInfo[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                completionInfoArr[i4] = new CompletionInfo(i4, i4, (CharSequence) arrayList.get(i4));
            }
            b.onDisplayCompletions(completionInfoArr);
            b.bS(this.i);
            return;
        }
        this.g = null;
        b.onDisplayCompletions(null);
        b.bS(null);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.e = new dbt();
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.h.h();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
        if (this.f != null) {
            this.f = null;
            this.g = null;
            this.h.h();
        }
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        int i = 0;
        if (editorInfo == null) {
            return false;
        }
        if (this.e != null) {
            this.a = han.AGSA.a(editorInfo) && ((Boolean) c.c()).booleanValue();
            this.b = ham.j(ham.a(editorInfo));
            this.g = null;
            String m = ham.m(editorInfo);
            dbt dbtVar = this.e;
            while (true) {
                if (i >= dbtVar.d.size()) {
                    break;
                } else if (((iqe) dbtVar.d.get(i)).j(m)) {
                    this.h.f(gyc.b);
                    this.f = m;
                    c(hqj.b());
                    break;
                } else {
                    i++;
                }
            }
        }
        return true;
    }

    @Override // defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }
}
