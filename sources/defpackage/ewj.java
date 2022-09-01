package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Range;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerResult;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: PG */
/* renamed from: ewj  reason: default package */
/* loaded from: classes.dex */
public final class ewj {
    public final Object a;
    public final Object b;

    public ewj(Context context, Delight5Facilitator delight5Facilitator) {
        this.b = context;
        this.a = delight5Facilitator;
    }

    public ewj(Delight5Facilitator delight5Facilitator, Locale locale) {
        this.b = locale;
        this.a = delight5Facilitator;
    }

    public ewj(EkhoMaterializerResult ekhoMaterializerResult) {
        this.a = ekhoMaterializerResult;
        this.b = null;
    }

    public ewj(inx inxVar, an anVar) {
        this.b = inxVar;
        this.a = anVar;
    }

    public ewj(Object obj, int[] iArr) {
        this.a = obj;
        this.b = iArr;
    }

    public ewj(String str) {
        this.a = null;
        this.b = str;
    }

    public ewj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    private ewj(Locale locale, mvm mvmVar) {
        this.a = locale;
        this.b = mvmVar;
    }

    public ewj(ZipFile zipFile, ZipEntry zipEntry) {
        this.a = zipFile;
        this.b = zipEntry;
    }

    public ewj(lmz lmzVar, lmz lmzVar2) {
        this.a = lmzVar;
        this.b = lmzVar2;
    }

    public ewj(char[] cArr) {
        this.a = new DecimalFormat("#.0000");
        this.b = new bjp();
    }

    public static ewj e(Object obj, int... iArr) {
        return new ewj(obj, iArr);
    }

    public static ewj k(Locale locale, mvm mvmVar) {
        return new ewj(locale, mvmVar);
    }

    private final String l(String str, float f) {
        return String.valueOf(str).concat(String.valueOf(((DecimalFormat) this.a).format(f)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [idk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ewd, java.lang.Object] */
    public final void a(nji njiVar) {
        this.b.e(evk.SPEECH_LEARNING_SCHEDULING_METRICS, njiVar);
        nfh t = nnt.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnt nntVar = (nnt) t.b;
        njiVar.getClass();
        nntVar.b = njiVar;
        nntVar.a |= 1;
        this.a.c(4, nni.SPEECH_LEARNING_SCHEDULING_RESULT, new evh((nnt) t.cz(), 0));
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [idk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ewd, java.lang.Object] */
    public final void b(nfh nfhVar, evj evjVar) {
        boolean z = evjVar.a;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        njl njlVar = (njl) nfhVar.b;
        njl njlVar2 = njl.j;
        njlVar.a |= 128;
        njlVar.h = z;
        boolean z2 = evjVar.b;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        njl njlVar3 = (njl) nfhVar.b;
        int i = njlVar3.a | 256;
        njlVar3.a = i;
        njlVar3.i = z2;
        boolean z3 = evjVar.c;
        njlVar3.a = i | 2;
        njlVar3.c = z3;
        this.b.e(evk.SPEECH_LEARNING_TASK_METRICS, nfhVar.cz());
        nfh t = nnu.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnu nnuVar = (nnu) t.b;
        njl njlVar4 = (njl) nfhVar.cz();
        njlVar4.getClass();
        nnuVar.b = njlVar4;
        nnuVar.a |= 1;
        this.a.c(4, nni.SPEECH_LEARNING_TASK_RESULT, new evh((nnu) t.cz(), 1));
    }

    public final void c() {
        an e = ((ap) this.b).hB().e("PreferencePageNavigator_Dialog");
        if (e instanceof ai) {
            ((ai) e).dismiss();
        }
    }

    public final void d(Intent intent, int i, Bundle bundle) {
        ((an) this.a).ag(intent, i, bundle);
    }

    public final int f() {
        return ((char[]) this.b).length >> 2;
    }

    public final char[] g(int i) {
        int i2 = i << 2;
        char[] cArr = (char[]) this.b;
        return new char[]{cArr[i2], cArr[i2 + 1]};
    }

    public final char[] h(int i) {
        int i2 = i << 2;
        char[] cArr = (char[]) this.b;
        return new char[]{cArr[i2 + 2], cArr[i2 + 3]};
    }

    public final bjd i(String str, float f) {
        List list = (List) ((qu) this.b).b(l(str, f));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (bjd) list.get(0);
    }

    public final void j(bjd bjdVar, String str) {
        if (bjdVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(bjdVar);
        ((qu) this.b).c(l(str, bjdVar.e), arrayList);
    }

    public ewj(Context context, byte[] bArr) {
        this.a = hrx.y(context);
        this.b = context;
    }

    public ewj(byte[] bArr) {
        this.b = btn.a(R.raw.f147460_resource_name_obfuscated_res_0x7f130063);
        this.a = btn.b(R.raw.f147480_resource_name_obfuscated_res_0x7f130065);
    }

    public ewj() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }

    public ewj(cuw cuwVar, int i, int i2) {
        this.b = cuwVar;
        this.a = Range.create(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public ewj(imn imnVar) {
        this.b = new ArrayList();
        this.a = imnVar;
    }

    public ewj(Context context) {
        this.b = ieh.j();
        this.a = evw.a(context);
    }
}
