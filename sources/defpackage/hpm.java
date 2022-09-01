package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputConnection;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;

/* compiled from: PG */
/* renamed from: hpm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hpm implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ hpm(bui buiVar, llp llpVar, llp llpVar2, Context context, View view, int i) {
        this.f = i;
        this.c = buiVar;
        this.d = llpVar;
        this.e = llpVar2;
        this.b = context;
        this.a = view;
    }

    public /* synthetic */ hpm(KeyboardViewHolder keyboardViewHolder, ibz ibzVar, ice iceVar, View view, htw htwVar, int i) {
        this.f = i;
        this.c = keyboardViewHolder;
        this.d = ibzVar;
        this.e = iceVar;
        this.b = view;
        this.a = htwVar;
    }

    public /* synthetic */ hpm(hpr hprVar, InputConnection inputConnection, idn idnVar, ids idsVar, String str, int i) {
        this.f = i;
        this.a = hprVar;
        this.b = inputConnection;
        this.c = idnVar;
        this.d = idsVar;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [idn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, htw] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        ids idsVar = null;
        if (i == 0) {
            Object obj = this.a;
            ?? r2 = this.b;
            ?? r3 = this.c;
            Object obj2 = this.d;
            ?? r5 = this.e;
            mkr mkrVar = ((hpr) obj).g;
            if ((mkrVar instanceof hpk) && ((hpk) mkrVar).b) {
                idsVar = obj2;
            }
            hpw.a.a("endBatchEdit()");
            r2.endBatchEdit();
            if (r3 != 0 && idsVar != null) {
                r3.b(idsVar);
            }
            TextUtils.isEmpty(r5);
        } else if (i != 1) {
            Object obj3 = this.c;
            KeyboardViewHolder.d((ibz) this.d, (ice) this.e, (View) this.b, this.a);
            ((KeyboardViewHolder) obj3).b = null;
        } else {
            Object obj4 = this.c;
            ?? r1 = this.d;
            ?? r32 = this.e;
            Object obj5 = this.b;
            Object obj6 = this.a;
            bui buiVar = (bui) obj4;
            if (!jdg.W(r1, buiVar.g)) {
                return;
            }
            int size = r32.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) r32.get(i2);
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                }
            }
            if (buiVar.m) {
                return;
            }
            buiVar.m = true;
            hsk b = hsx.b();
            if (b != null) {
                b.O().e(R.string.f166280_resource_name_obfuscated_res_0x7f1408c8);
            }
            bui.i((llp) r32);
            if (!buiVar.j) {
                for (int i3 = 0; i3 < r32.size(); i3++) {
                    Animation loadAnimation = AnimationUtils.loadAnimation((Context) obj5, R.anim.f80_resource_name_obfuscated_res_0x7f01000c);
                    loadAnimation.setStartOffset(i3 * 50);
                    ((View) r32.get(i3)).startAnimation(loadAnimation);
                }
                if (obj6 != null) {
                    ino.L().i("clipboard_chip_shown_count", ino.L().c("clipboard_chip_shown_count", 0L) + 1);
                }
            }
            boolean z = buiVar.j;
            buk bukVar = (buk) ((llp) r1).get(0);
            if (!TextUtils.isEmpty(bukVar.i())) {
                buiVar.b.e(bwa.CHIP_EVENT, 3);
                if (!z) {
                    buiVar.b.e(bwa.CHIP_EVENT, 5);
                }
                int size2 = r1.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    buk bukVar2 = (buk) r1.get(i4);
                    if (!z) {
                        buiVar.b.e(bwa.ENTITY_CHIP_SHOWN_UNIQUE, Integer.valueOf(bukVar2.c()));
                    }
                }
            } else {
                String j = bukVar.j();
                if (!TextUtils.isEmpty(j)) {
                    boolean l = bvu.l((Context) obj5, j);
                    idk idkVar = buiVar.b;
                    bwa bwaVar = bwa.CHIP_EVENT;
                    Object[] objArr = new Object[1];
                    objArr[0] = Integer.valueOf(true != l ? 12 : 4);
                    idkVar.e(bwaVar, objArr);
                    if (!z) {
                        idk idkVar2 = buiVar.b;
                        bwa bwaVar2 = bwa.CHIP_EVENT;
                        Object[] objArr2 = new Object[1];
                        objArr2[0] = Integer.valueOf(true != l ? 13 : 6);
                        idkVar2.e(bwaVar2, objArr2);
                    }
                }
            }
            buiVar.j = true;
        }
    }
}
