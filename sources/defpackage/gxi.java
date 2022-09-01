package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import com.google.android.libraries.inputmethod.featuresplit.debugactivity.FeatureSplitDebugActivity;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import java.util.Collection;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gxi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gxi implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gxi(InputConnection inputConnection, KeyEvent keyEvent, int i) {
        this.c = i;
        this.b = inputConnection;
        this.a = keyEvent;
    }

    public /* synthetic */ gxi(InputConnection inputConnection, CompletionInfo completionInfo, int i) {
        this.c = i;
        this.b = inputConnection;
        this.a = completionInfo;
    }

    public /* synthetic */ gxi(InputConnection inputConnection, CorrectionInfo correctionInfo, int i) {
        this.c = i;
        this.b = inputConnection;
        this.a = correctionInfo;
    }

    public /* synthetic */ gxi(InputConnection inputConnection, String str, int i) {
        this.c = i;
        this.a = inputConnection;
        this.b = str;
    }

    public gxi(FeatureSplitDebugActivity featureSplitDebugActivity, Exception exc, int i) {
        this.c = i;
        this.a = featureSplitDebugActivity;
        this.b = exc;
    }

    public gxi(FeatureSplitDebugActivity featureSplitDebugActivity, Collection collection, int i) {
        this.c = i;
        this.a = featureSplitDebugActivity;
        this.b = collection;
    }

    public /* synthetic */ gxi(KeyboardViewHolder keyboardViewHolder, View view, int i) {
        this.c = i;
        this.b = keyboardViewHolder;
        this.a = view;
    }

    public /* synthetic */ gxi(gxm gxmVar, mkp mkpVar, int i) {
        this.c = i;
        this.a = gxmVar;
        this.b = mkpVar;
    }

    public /* synthetic */ gxi(gxn gxnVar, Runnable runnable, int i) {
        this.c = i;
        this.a = gxnVar;
        this.b = runnable;
    }

    public /* synthetic */ gxi(hcp hcpVar, hcn hcnVar, int i) {
        this.c = i;
        this.b = hcpVar;
        this.a = hcnVar;
    }

    public gxi(hgj hgjVar, FeatureSplitDebugActivity featureSplitDebugActivity, int i) {
        this.c = i;
        this.a = hgjVar;
        this.b = featureSplitDebugActivity;
    }

    public /* synthetic */ gxi(hhr hhrVar, lmz lmzVar, int i) {
        this.c = i;
        this.a = hhrVar;
        this.b = lmzVar;
    }

    public /* synthetic */ gxi(hmd hmdVar, CompletionInfo completionInfo, int i) {
        this.c = i;
        this.b = hmdVar;
        this.a = completionInfo;
    }

    public /* synthetic */ gxi(hmd hmdVar, hfd hfdVar, int i) {
        this.c = i;
        this.b = hmdVar;
        this.a = hfdVar;
    }

    public /* synthetic */ gxi(hmd hmdVar, String str, int i) {
        this.c = i;
        this.a = hmdVar;
        this.b = str;
    }

    public /* synthetic */ gxi(hmd hmdVar, List list, int i) {
        this.c = i;
        this.a = hmdVar;
        this.b = list;
    }

    public /* synthetic */ gxi(hrx hrxVar, Collection collection, int i) {
        this.c = i;
        this.a = hrxVar;
        this.b = collection;
    }

    public /* synthetic */ gxi(hxz hxzVar, Context context, int i) {
        this.c = i;
        this.b = hxzVar;
        this.a = context;
    }

    public /* synthetic */ gxi(idz idzVar, byte[] bArr, int i) {
        this.c = i;
        this.a = idzVar;
        this.b = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, hhl] */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ((mjv) this.a).execute(this.b);
                return;
            case 1:
                ((mjv) this.a).execute(this.b);
                return;
            case 2:
                ((gxn) this.a).execute(this.b);
                return;
            case 3:
                Object obj = this.a;
                try {
                    this.b.run();
                    return;
                } catch (RuntimeException e) {
                    ((gxn) obj).a.execute(new gxd(e, 3));
                    return;
                }
            case 4:
                gqa.a(((hcp) this.b).b).o((EmojiView) ((hcn) this.a).a.get());
                return;
            case 5:
                TextView m = ((FeatureSplitDebugActivity) this.a).m();
                String w = nxp.w(this.b, null, null, null, null, 63);
                m.append("startInstall(): " + w + "\n");
                return;
            case 6:
                ((FeatureSplitDebugActivity) this.a).m().append(String.valueOf(((Exception) this.b).getMessage()).concat("\n"));
                return;
            case 7:
                Collection<String> c = ((hgj) this.a).c();
                jma jmaVar = new jma();
                for (String str : c) {
                    jmaVar.b.add(str);
                }
                gen b = ((FeatureSplitDebugActivity) this.b).q().b(new lbb(jmaVar, null));
                b.k(new hgq((FeatureSplitDebugActivity) this.b, c, 0));
                b.j(new hgr((FeatureSplitDebugActivity) this.b));
                return;
            case 8:
                ?? r0 = this.a;
                lsz it = ((lmz) this.b).iterator();
                while (it.hasNext()) {
                    ((hhk) it.next()).ib(r0);
                }
                return;
            case 9:
                ((hmd) this.b).a.hU((CompletionInfo) this.a);
                return;
            case 10:
                ((hmd) this.a).a.R((String) this.b);
                return;
            case 11:
                ((hmd) this.b).a.O((hfd) this.a);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj2 = this.a;
                ((hmd) obj2).a.T(this.b);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ?? r02 = this.b;
                Object obj3 = this.a;
                ltg ltgVar = hpr.a;
                hpw.g(r02, (CompletionInfo) obj3);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ?? r03 = this.b;
                Object obj4 = this.a;
                ltg ltgVar2 = hpr.a;
                hpw.a.a("sendKeyEvent(<event>)");
                r03.sendKeyEvent((KeyEvent) obj4);
                return;
            case 15:
                ?? r04 = this.b;
                Object obj5 = this.a;
                ltg ltgVar3 = hpr.a;
                hpw.h(r04, (CorrectionInfo) obj5);
                return;
            case 16:
                ?? r05 = this.a;
                Object obj6 = this.b;
                ltg ltgVar4 = hpr.a;
                hpw.f(r05, (String) obj6);
                return;
            case 17:
                ((hrx) this.a).Q(this.b);
                return;
            case 18:
                KeyboardViewHolder keyboardViewHolder = (KeyboardViewHolder) this.b;
                keyboardViewHolder.removeView((View) this.a);
                keyboardViewHolder.c = null;
                return;
            case 19:
                Object obj7 = this.b;
                Context context = (Context) this.a;
                llp o = jbt.o(context);
                if (o.isEmpty()) {
                    ((ltd) ((ltd) hxz.a.d()).k("com/google/android/libraries/inputmethod/launchericon/LauncherIconVisibilityInitializerBase", "lambda$doUpdate$1", 65, "LauncherIconVisibilityInitializerBase.java")).t("Didn't find any LauncherActivity in AndroidManifest!");
                    return;
                }
                boolean c2 = ((hxz) obj7).c(context);
                int i = ((lrl) o).c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((ltd) ((ltd) hxz.a.b()).k("com/google/android/libraries/inputmethod/launchericon/LauncherIconVisibilityInitializerBase", "lambda$doUpdate$1", 70, "LauncherIconVisibilityInitializerBase.java")).w("doUpdate() : Visible = %b", Boolean.valueOf(c2));
                    jbt.A(context, (ComponentName) o.get(i2), c2);
                }
                return;
            default:
                Object obj8 = this.a;
                Object obj9 = this.b;
                idz idzVar = (idz) obj8;
                idzVar.e.g();
                fma fmaVar = idzVar.e;
                if (obj9 != null) {
                    byte[] bArr = (byte[]) obj9;
                    if (bArr.length != 0) {
                        fmaVar.e(new flv(bArr));
                        return;
                    }
                }
                fmaVar.e(fma.c);
                return;
        }
    }
}
