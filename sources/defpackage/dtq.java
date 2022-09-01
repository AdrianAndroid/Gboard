package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: dtq  reason: default package */
/* loaded from: classes.dex */
public final class dtq {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/input/NgaVoiceInputHandler");
    public final Context b;
    public final dup c;
    public final lgb d;
    public final fbr e;
    public final fai f;
    public final lgb g;
    public dtp h;
    public EditorInfo i;
    public boolean j;
    public final dxe k;
    private final jbw l;
    private hfy m;

    public dtq(Context context, fbr fbrVar, fai faiVar, dxe dxeVar, dup dupVar, lgb lgbVar, jbw jbwVar, lgb lgbVar2, byte[] bArr) {
        this.b = context;
        this.k = dxeVar;
        this.c = dupVar;
        this.d = lgbVar;
        this.l = jbwVar;
        this.e = fbrVar;
        this.f = faiVar;
        this.g = lgbVar2;
    }

    public final void a() {
        hfy hfyVar = this.m;
        EditorInfo editorInfo = this.i;
        if (hfyVar == null || editorInfo == null || this.h != null) {
            return;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/NgaVoiceInputHandler", "maybeCreateInputManager", 146, "NgaVoiceInputHandler.java")).t("VoiceInputHandler:activating");
        dtv dtvVar = new dtv(this.l);
        Context context = this.b;
        dxe dxeVar = this.k;
        jbw jbwVar = this.l;
        dup dupVar = this.c;
        dtu dtuVar = (dtu) dtu.b.get();
        if (dtuVar == null) {
            dtuVar = new dtu(context);
            dtu.b.set(dtuVar);
        }
        dtu dtuVar2 = dtuVar;
        dud dudVar = new dud();
        ieh j = ieh.j();
        dtn dtnVar = new dtn();
        mks a2 = gxo.a(6);
        hbd hbdVar = null;
        if (irs.d() && ((Boolean) dsu.k.c()).booleanValue()) {
            hbdVar = hbd.h(context);
        }
        dtp dtpVar = new dtp(context, dudVar, j, dxeVar, dtnVar, hfyVar, dtvVar, jbwVar, editorInfo, dupVar, dtuVar2, a2, hbdVar, null);
        this.h = dtpVar;
        if (!f()) {
            return;
        }
        dtpVar.i();
    }

    public final void b(hfy hfyVar) {
        this.m = hfyVar;
        a();
    }

    public final void c(EditorInfo editorInfo, boolean z) {
        this.i = editorInfo;
        this.j = z;
        a();
    }

    public final void d() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/NgaVoiceInputHandler", "onDeactivateIme", 164, "NgaVoiceInputHandler.java")).t("VoiceInputHandler:deactivating");
        dvf d = dvf.d();
        if (d != null) {
            d.g();
        }
        dtp dtpVar = this.h;
        if (dtpVar != null) {
            dtpVar.j();
        }
        this.h = null;
        this.i = null;
        this.j = false;
    }

    public final void e(jbx jbxVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/NgaVoiceInputHandler", "stopVoiceInput", 256, "NgaVoiceInputHandler.java")).w("StopVoiceInput: %s", jbxVar);
        dtp dtpVar = this.h;
        if (dtpVar == null) {
            return;
        }
        jbx jbxVar2 = jbx.SELECTION_CHANGE;
        int ordinal = jbxVar.ordinal();
        if (ordinal == 0) {
            dtpVar.e();
            this.c.d(fhz.CURSOR_CHANGE);
        } else if (ordinal == 2) {
            dtpVar.e();
            this.c.d(fhz.FIELD_CHANGE);
        } else if (ordinal != 3) {
        } else {
            dtpVar.c(false);
            this.c.a();
        }
    }

    public final boolean f() {
        if (!((dsx) this.d.a()).f) {
            dtp dtpVar = this.h;
            return dtpVar != null && dtpVar.k;
        }
        return true;
    }
}
