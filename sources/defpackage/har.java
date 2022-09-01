package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import j$.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: har  reason: default package */
/* loaded from: classes.dex */
public final class har {
    public static volatile har c;
    private final Map i = new qo();
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader");
    private static final int[] e = {0, R.raw.f147280_resource_name_obfuscated_res_0x7f130046, R.raw.f147320_resource_name_obfuscated_res_0x7f13004a, R.raw.f147270_resource_name_obfuscated_res_0x7f130045, R.raw.f147300_resource_name_obfuscated_res_0x7f130048, R.raw.f147350_resource_name_obfuscated_res_0x7f13004d, R.raw.f147260_resource_name_obfuscated_res_0x7f130044, R.raw.f147310_resource_name_obfuscated_res_0x7f130049, R.raw.f147340_resource_name_obfuscated_res_0x7f13004c, R.raw.f147290_resource_name_obfuscated_res_0x7f130047};
    private static final int[] f = {0, R.raw.f147280_resource_name_obfuscated_res_0x7f130046, R.raw.f147330_resource_name_obfuscated_res_0x7f13004b, R.raw.f147270_resource_name_obfuscated_res_0x7f130045, R.raw.f147300_resource_name_obfuscated_res_0x7f130048, R.raw.f147350_resource_name_obfuscated_res_0x7f13004d, R.raw.f147260_resource_name_obfuscated_res_0x7f130044, R.raw.f147310_resource_name_obfuscated_res_0x7f130049, R.raw.f147340_resource_name_obfuscated_res_0x7f13004c, R.raw.f147290_resource_name_obfuscated_res_0x7f130047};
    public static final int[] b = {R.string.f150750_resource_name_obfuscated_res_0x7f1401c1, R.string.f150650_resource_name_obfuscated_res_0x7f1401b7, R.string.f150730_resource_name_obfuscated_res_0x7f1401bf, R.string.f150630_resource_name_obfuscated_res_0x7f1401b5, R.string.f150690_resource_name_obfuscated_res_0x7f1401bb, R.string.f150790_resource_name_obfuscated_res_0x7f1401c5, R.string.f150610_resource_name_obfuscated_res_0x7f1401b3, R.string.f150710_resource_name_obfuscated_res_0x7f1401bd, R.string.f150770_resource_name_obfuscated_res_0x7f1401c3, R.string.f150670_resource_name_obfuscated_res_0x7f1401b9};
    private static final gwa g = new gwa();
    private static final gwa h = new gwa();
    static final hhl d = hhq.a("enable_emoji_loader_migration", false);

    public static gwk a(Context context) {
        return (gwk) g.a(new etm(context, 14));
    }

    public static har b() {
        har harVar = c;
        if (harVar == null) {
            synchronized (har.class) {
                harVar = c;
                if (harVar == null) {
                    harVar = new har();
                    c = harVar;
                }
            }
        }
        return harVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static llp c(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            lfy c2 = lfy.c(',');
            llk e2 = llp.e();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    List k = c2.k(readLine);
                    int size = k.size();
                    hds hdsVar = null;
                    if (size != 0) {
                        if (size == 1) {
                            String str = (String) k.get(0);
                            if (!TextUtils.isEmpty(str)) {
                                hdsVar = hds.a(str, llp.q());
                            }
                        } else {
                            hdsVar = hds.a((String) k.get(0), llp.o(k.subList(1, k.size())));
                        }
                    }
                    if (hdsVar != null) {
                        e2.h(hdsVar);
                    }
                } else {
                    llp g2 = e2.g();
                    bufferedReader.close();
                    return g2;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(OutputStream outputStream, List list) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bufferedWriter.write((String) it.next());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(OutputStream outputStream, List list) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hds hdsVar = (hds) it.next();
            bufferedWriter.write(hdsVar.a);
            lta listIterator = hdsVar.b.listIterator();
            while (listIterator.hasNext()) {
                String str = (String) listIterator.next();
                if (str != null) {
                    bufferedWriter.write(44);
                    bufferedWriter.write(str);
                }
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public final synchronized mko d(Context context, final mkr mkrVar, final hdl hdlVar) {
        int[] iArr;
        mko mkoVar = (mko) this.i.get(hdlVar);
        if (mkoVar == null) {
            llk e2 = llp.e();
            int[] iArr2 = hdn.g(hdlVar) ? f : e;
            char c2 = 0;
            int i = 0;
            while (i < 10) {
                final int i2 = iArr2[i];
                if (i2 == 0) {
                    e2.h(kcu.K(llp.q()));
                    iArr = iArr2;
                } else if (!((Boolean) d.c()).booleanValue()) {
                    iArr = iArr2;
                    String format = String.format(Locale.US, "emoji.v1.%s.%d.%d", Integer.valueOf(hdlVar.hashCode()), Integer.valueOf(i), Integer.valueOf(hdn.g(hdlVar) ? 1 : 0));
                    gwk a2 = a(context);
                    e2.h(mio.h(a2.a(format, mkrVar), new hap(context, i2, hdlVar, a2, format, mkrVar, 0), mkrVar));
                } else {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[3];
                    objArr[c2] = Integer.valueOf(hdlVar.hashCode());
                    objArr[1] = Integer.valueOf(i);
                    objArr[2] = Integer.valueOf(hdn.g(hdlVar) ? 1 : 0);
                    final String format2 = String.format(locale, "emoji-filter-flag.v1.%s.%d.%d", objArr);
                    final gwk gwkVar = (gwk) h.a(new etm(context, 13));
                    final mko a3 = gwkVar.a(format2, mkrVar);
                    final mko mkoVar2 = hdq.b().c;
                    mko[] mkoVarArr = new mko[2];
                    mkoVarArr[c2] = a3;
                    mkoVarArr[1] = mkoVar2;
                    iArr = iArr2;
                    e2.h(kcu.Z(mkoVarArr).a(new Callable() { // from class: hao
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            mko mkoVar3 = mko.this;
                            int i3 = i2;
                            mko mkoVar4 = a3;
                            hdl hdlVar2 = hdlVar;
                            gwk gwkVar2 = gwkVar;
                            String str = format2;
                            mkr mkrVar2 = mkrVar;
                            llp<hds> llpVar = (llp) ((llw) kcu.S(mkoVar3)).get(Integer.valueOf(i3));
                            if (llpVar == null) {
                                return llp.q();
                            }
                            llp llpVar2 = (llp) kcu.S(mkoVar4);
                            if (llpVar2 == null || llpVar2.size() != llpVar.size()) {
                                hdz a4 = hdz.a();
                                llk e3 = llp.e();
                                for (hds hdsVar : llpVar) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(true != a4.g(hdsVar.a, hdlVar2) ? '0' : '1');
                                    llp llpVar3 = hdsVar.b;
                                    int size = llpVar3.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        sb.append(true != a4.g((String) llpVar3.get(i4), hdlVar2) ? '0' : '1');
                                    }
                                    e3.h(sb.toString());
                                }
                                llpVar2 = e3.g();
                                gwkVar2.d(str, llpVar2, mkrVar2);
                            }
                            llk e4 = llp.e();
                            for (int i5 = 0; i5 < llpVar2.size(); i5++) {
                                String str2 = (String) llpVar2.get(i5);
                                if (!str2.isEmpty()) {
                                    hds hdsVar2 = (hds) llpVar.get(i5);
                                    if (str2.indexOf(48) == -1) {
                                        e4.h(hdsVar2);
                                    } else {
                                        char c3 = '1';
                                        if (str2.indexOf(49) != -1) {
                                            llk e5 = llp.e();
                                            int i6 = 1;
                                            while (i6 < str2.length()) {
                                                if (str2.charAt(i6) == c3) {
                                                    e5.h((String) hdsVar2.b.get(i6 - 1));
                                                }
                                                i6++;
                                                c3 = '1';
                                            }
                                            llp g2 = e5.g();
                                            if (str2.charAt(0) == '1') {
                                                String str3 = hdsVar2.a;
                                                if (((lrl) g2).c == 1) {
                                                    g2 = llp.q();
                                                }
                                                e4.h(hds.a(str3, g2));
                                            } else {
                                                lrl lrlVar = (lrl) g2;
                                                if (lrlVar.c > 0) {
                                                    String str4 = (String) g2.get(0);
                                                    if (lrlVar.c == 1) {
                                                        g2 = llp.q();
                                                    }
                                                    e4.h(hds.a(str4, g2));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return e4.g();
                        }
                    }, mkrVar));
                }
                i++;
                iArr2 = iArr;
                c2 = 0;
            }
            mko G = kcu.G(e2.g());
            this.i.put(hdlVar, G);
            return G;
        }
        return mkoVar;
    }
}
