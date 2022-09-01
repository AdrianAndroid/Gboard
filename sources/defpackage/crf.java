package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.fileprovider.CrashResistantFileProvider;
import j$.util.Objects;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: crf  reason: default package */
/* loaded from: classes.dex */
public final class crf {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/image/ImageShareWorker");
    public static final hhl b = hhq.a("skip_image_share_request_validation", false);
    public final Context c;
    public final cqk d;
    public final crl e;
    private final mkr f;
    private final cqq g;
    private final idk h;

    static {
        hhq.a("enable_image_share_debug_toast", false);
    }

    public crf(Context context) {
        this(context, gxo.a(6), new cqk(context.getApplicationContext()), new crl(context.getApplicationContext()), new cqq(context, ieh.j()), ieh.j());
    }

    public crf(Context context, mkr mkrVar, cqk cqkVar, crl crlVar, cqq cqqVar, idk idkVar) {
        this.c = context;
        this.f = mkrVar;
        this.d = cqkVar;
        this.e = crlVar;
        this.g = cqqVar;
        this.h = idkVar;
    }

    public final hiz a(cra craVar) {
        hiz l;
        mko e;
        idn a2 = this.h.a(crh.IMAGE_SHARE_TOTAL);
        idn a3 = cnx.e(craVar.a.d()) ? this.h.a(crh.BITMOJI_SHARE_TOTAL) : null;
        cqq cqqVar = this.g;
        cqp cqpVar = craVar.a;
        File u = cqpVar.u();
        if (u == null) {
            Uri d = craVar.a.d();
            EditorInfo editorInfo = craVar.c;
            if (!cnx.e(d) || (!((Boolean) cqq.a.c()).booleanValue() && (!((Boolean) cqq.b.c()).booleanValue() || cqqVar.b() || !crp.b(cqqVar.e, editorInfo)))) {
                l = hiz.l();
            } else {
                l = hiz.p(new brs(cqqVar, d, 10), cqqVar.f).x(cqq.d, TimeUnit.MILLISECONDS, cqqVar.g);
                l.F(new buo(cqqVar, 7), mjl.a);
            }
            e = l.e(new bxo(cqqVar, cqpVar, 19), mjl.a);
        } else {
            e = kcu.K(u);
        }
        hiz a4 = hiz.k(hiz.k(e).v(new bxo(cqqVar, craVar, 18), mjl.a)).u(cli.s, this.f).u(new leq() { // from class: crd
            @Override // defpackage.leq
            public final Object a(Object obj) {
                lfb lfbVar;
                cqj cqjVar;
                mcb mcbVar;
                crc a5;
                crc crcVar;
                crc crcVar2;
                crf crfVar = crf.this;
                cra craVar2 = (cra) obj;
                hsk b2 = hsx.b();
                if (craVar2.a.l().isEmpty()) {
                    ((ltd) ((ltd) crf.a.c()).k("com/google/android/apps/inputmethod/libs/expression/image/ImageShareWorker", "performPrelimShareChecks", 218, "ImageShareWorker.java")).t("All content is unshareable");
                    lfbVar = lfb.g(mcb.KEYBOARD_IMAGE_INSERT_RESULT_FAILURE_UNSHAREABLE);
                } else {
                    Context context = crfVar.c;
                    if (!CrashResistantFileProvider.c(context, crk.h(context))) {
                        ((ltd) ((ltd) crf.a.c()).k("com/google/android/apps/inputmethod/libs/expression/image/ImageShareWorker", "performPrelimShareChecks", 224, "ImageShareWorker.java")).t("File provider is not initialized");
                        lfbVar = lfb.g(mcb.KEYBOARD_IMAGE_INSERT_RESULT_DISABLED);
                    } else if (b2 == null) {
                        ((ltd) ((ltd) crf.a.c()).k("com/google/android/apps/inputmethod/libs/expression/image/ImageShareWorker", "performPrelimShareChecks", 228, "ImageShareWorker.java")).t("Service is null");
                        lfbVar = lfb.g(mcb.KEYBOARD_IMAGE_INSERT_RESULT_INPUT_SERVICE_IS_NULL);
                    } else if (ham.i(b2.N()).equals(ham.i(craVar2.c))) {
                        if (((Boolean) crf.b.c()).booleanValue() || !craVar2.e.e() || ((Boolean) ((lgb) craVar2.e.a()).a()).booleanValue()) {
                            lfbVar = ldu.a;
                        } else {
                            ((ltd) ((ltd) crf.a.c()).k("com/google/android/apps/inputmethod/libs/expression/image/ImageShareWorker", "performPrelimShareChecks", 239, "ImageShareWorker.java")).t("request#canStillShare() returned false");
                            lfbVar = lfb.g(mcb.KEYBOARD_IMAGE_INSERT_RESULT_INVALID_STATE);
                        }
                    } else {
                        ((ltd) ((ltd) crf.a.c()).k("com/google/android/apps/inputmethod/libs/expression/image/ImageShareWorker", "performPrelimShareChecks", 233, "ImageShareWorker.java")).t("Editor has changed since request");
                        lfbVar = lfb.g(mcb.KEYBOARD_IMAGE_INSERT_RESULT_EDITOR_INFO_CHANGED);
                    }
                }
                if (lfbVar.e()) {
                    crb a6 = crc.a();
                    a6.g(craVar2);
                    a6.c((mcb) lfbVar.a());
                    crc a7 = a6.a();
                    crfVar.b(a7);
                    return a7;
                }
                cqk cqkVar = crfVar.d;
                List n = ham.n(craVar2.c);
                Uri uri = (Uri) craVar2.a.l().get("image/webp.wasticker");
                if (uri == null || !crp.b(cqkVar.c, craVar2.c)) {
                    lsz it = craVar2.a.l().entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            cqjVar = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (jbc.g((String) entry.getKey(), n)) {
                            cqjVar = cqj.a((String) entry.getKey(), (Uri) entry.getValue());
                            break;
                        }
                    }
                } else {
                    cqjVar = cqj.a("image/webp.wasticker", uri);
                }
                if (cqjVar == null) {
                    ((ltd) ((ltd) cqk.a.c()).k("com/google/android/apps/inputmethod/libs/expression/image/CommitContentHelper", "share", 50, "CommitContentHelper.java")).G("No shareable uris mime-types [%s] match editor mime-types [%s]", cqk.b.f(craVar2.a.l().keySet()), cqk.b.f(ham.n(craVar2.c)));
                    crb a8 = crc.a();
                    a8.g(craVar2);
                    a8.c(mcb.KEYBOARD_IMAGE_INSERT_RESULT_NO_BEST_MIMETYPE_AND_URI);
                    a5 = a8.a();
                } else {
                    Uri uri2 = cqjVar.b;
                    String str = cqjVar.a;
                    cqp cqpVar2 = craVar2.a;
                    String n2 = cqpVar2.n();
                    Uri d2 = cqpVar2.d();
                    if (true != iin.c(d2)) {
                        d2 = null;
                    }
                    if (TextUtils.isEmpty(n2)) {
                        n2 = cqkVar.c.getString(R.string.f154190_resource_name_obfuscated_res_0x7f140348);
                    }
                    boolean bR = b2.bR(new aqq(uri2, new ClipDescription(n2, new String[]{str}), d2));
                    ((ltd) ((ltd) cqk.a.b()).k("com/google/android/apps/inputmethod/libs/expression/image/CommitContentHelper", "share", 65, "CommitContentHelper.java")).K("Committed image with mime-type=[%s], uri=[%s], tag=[%s], and success=%s", cqjVar.a, cqjVar.b, craVar2.a.r(), Boolean.valueOf(bR));
                    crb a9 = crc.a();
                    a9.g(craVar2);
                    if (bR) {
                        mcbVar = mcb.KEYBOARD_IMAGE_INSERT_RESULT_SUCCESS_ORIGINAL;
                    } else {
                        mcbVar = mcb.KEYBOARD_IMAGE_INSERT_RESULT_COMMIT_CONTENT_TO_APP_FAILED;
                    }
                    a9.c(mcbVar);
                    a9.f(cqjVar.b);
                    a9.d(cqjVar.a);
                    a5 = a9.a();
                }
                if (!a5.c()) {
                    if (!iql.a(craVar2.c)) {
                        crfVar.b(a5);
                    } else {
                        crl crlVar = crfVar.e;
                        lsz it2 = craVar2.a.l().entrySet().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it2.next();
                                if (iql.b(crlVar.b, (Uri) entry2.getValue(), (String) entry2.getKey(), craVar2.c.packageName)) {
                                    ((ltd) ((ltd) crl.a.b()).k("com/google/android/apps/inputmethod/libs/expression/image/ShareIntentHelper", "shareShareableUri", 43, "ShareIntentHelper.java")).G("Sent share intent for image with mime-type=[%s] and tag=[%s]", entry2.getKey(), craVar2.a.r());
                                    crb a10 = crc.a();
                                    a10.g(craVar2);
                                    a10.c(mcb.KEYBOARD_IMAGE_INSERT_RESULT_SUCCESS_INTENT);
                                    a10.f((Uri) entry2.getValue());
                                    a10.d((String) entry2.getKey());
                                    crcVar = a10.a();
                                    break;
                                }
                            } else {
                                ((ltd) ((ltd) crl.a.c()).k("com/google/android/apps/inputmethod/libs/expression/image/ShareIntentHelper", "shareShareableUri", 55, "ShareIntentHelper.java")).w("No shareable Uri found for image with tag=[%s]", craVar2.a.r());
                                crcVar = null;
                                break;
                            }
                        }
                        if (crcVar == null) {
                            crb a11 = crc.a();
                            a11.g(craVar2);
                            a11.c(mcb.KEYBOARD_IMAGE_INSERT_RESULT_SHARE_INTENT_FAILED);
                            crcVar2 = a11.a();
                        } else {
                            crcVar2 = crcVar;
                        }
                        crfVar.b(crcVar2);
                        return crcVar2;
                    }
                } else {
                    cuz cuzVar = cuz.a;
                    crfVar.b(a5);
                }
                return a5;
            }
        }, gyc.b).a(Throwable.class, new cjq(this, craVar, 3), gyc.b);
        Objects.requireNonNull(a2);
        a4.d(new cbq(a2, 19), mjl.a);
        if (a3 != null) {
            Objects.requireNonNull(a3);
            a4.d(new cbq(a3, 19), mjl.a);
        }
        return a4;
    }

    public final void b(crc crcVar) {
        CharSequence charSequence;
        String string;
        if (!crcVar.c()) {
            Context context = this.c;
            if (!crcVar.c()) {
                mcb mcbVar = crcVar.d;
                if (mcbVar == mcb.KEYBOARD_IMAGE_INSERT_RESULT_FAILURE || mcbVar == mcb.KEYBOARD_IMAGE_INSERT_RESULT_NO_BEST_MIMETYPE_AND_URI || mcbVar == mcb.KEYBOARD_IMAGE_INSERT_RESULT_COMMIT_CONTENT_TO_APP_FAILED || mcbVar == mcb.KEYBOARD_IMAGE_INSERT_RESULT_SHARE_INTENT_FAILED || mcbVar == mcb.KEYBOARD_IMAGE_INSERT_RESULT_INPUT_SERVICE_IS_NULL || mcbVar == mcb.KEYBOARD_IMAGE_INSERT_RESULT_EDITOR_INFO_CHANGED) {
                    String d = lfd.d(crcVar.c.packageName);
                    PackageManager packageManager = context.getPackageManager();
                    try {
                        charSequence = packageManager.getApplicationLabel(packageManager.getApplicationInfo(d, 128));
                    } catch (PackageManager.NameNotFoundException unused) {
                        charSequence = "";
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        string = context.getString(R.string.f154160_resource_name_obfuscated_res_0x7f140345, gqa.b(context.getApplicationContext(), charSequence));
                    } else {
                        string = context.getString(R.string.f154170_resource_name_obfuscated_res_0x7f140346);
                    }
                } else {
                    string = context.getString(R.string.f166930_resource_name_obfuscated_res_0x7f14090e);
                }
                ker.q(context, 1, string);
                return;
            }
            throw new IllegalStateException("Response is not a failure");
        }
        gqa.a(this.c).g(R.string.f154040_resource_name_obfuscated_res_0x7f140339, lfd.d(crcVar.a.n()));
    }
}
