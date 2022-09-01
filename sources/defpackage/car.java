package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import j$.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* renamed from: car  reason: default package */
/* loaded from: classes.dex */
public final class car implements hhk {
    private volatile llw f;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/DelightBadWordsHandler");
    private static final byte[] d = "P88NQIxHqwip2s8b".getBytes(StandardCharsets.UTF_8);
    private static final byte[] e = "131BCC3FD1F53F69".getBytes(StandardCharsets.UTF_8);
    static final hhl b = hhq.a("in_memory_bad_words", true);
    public static final hhl c = hhq.a("delete_persisted_bad_words", true);

    public car() {
        cgr.a.f(this, c());
    }

    static llw b(cgw cgwVar) {
        lls h = llw.h();
        for (cgv cgvVar : cgwVar.a) {
            int t = efq.t(cgvVar.a);
            if (t != 0 && t == 2) {
                for (cgt cgtVar : cgvVar.b) {
                    int j = cog.j(cgtVar.a);
                    if (j != 0 && j == 6) {
                        Locale f = jay.f(cgtVar.b);
                        cgu cguVar = cgtVar.c;
                        if (cguVar == null) {
                            cguVar = cgu.b;
                        }
                        h.a(f, cguVar.a);
                    }
                }
            }
        }
        return h.l();
    }

    public static mkr c() {
        return gxo.a(10);
    }

    public final Collection d(Locale locale) {
        if (!((Boolean) b.c()).booleanValue()) {
            ino L = ino.L();
            Set<String> e2 = L.e("pref_key_emergency_bad_words_".concat(String.valueOf(locale.toString())), Collections.emptySet());
            if (!L.e("pref_key_obfuscated_locales", new HashSet()).contains(locale.toString())) {
                return e2;
            }
            try {
                Charset charset = StandardCharsets.ISO_8859_1;
                Charset charset2 = StandardCharsets.UTF_8;
                SecretKeySpec secretKeySpec = new SecretKeySpec(d, "AES");
                Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(e));
                HashSet hashSet = new HashSet();
                for (String str : e2) {
                    hashSet.add(new String(cipher.doFinal(str.getBytes(charset)), charset2));
                }
                return hashSet;
            } catch (GeneralSecurityException e3) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e3)).k("com/google/android/apps/inputmethod/libs/delight5/DelightBadWordsHandler", "getBadWords", 128, "DelightBadWordsHandler.java")).w("Failed to de-obfuscate words for %s", locale);
                return Collections.emptyList();
            }
        }
        llw llwVar = this.f;
        if (llwVar == null) {
            llwVar = b((cgw) cgr.a.j());
            this.f = llwVar;
        }
        List list = (List) llwVar.get(locale);
        return list != null ? list : Collections.emptyList();
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        if (!((Boolean) b.c()).booleanValue()) {
            return;
        }
        llw llwVar = this.f;
        this.f = b((cgw) cgr.a.j());
        Delight5Facilitator g = Delight5Facilitator.g();
        if (g == null) {
            return;
        }
        List<Locale> n = g.n();
        llw llwVar2 = this.f;
        if (llwVar == null || llwVar.isEmpty()) {
            if (llwVar2.isEmpty() || Collections.disjoint(n, llwVar2.keySet())) {
                return;
            }
        } else if (llwVar2.isEmpty()) {
            if (Collections.disjoint(n, llwVar.keySet())) {
                return;
            }
        } else {
            for (Locale locale : n) {
                List list = (List) llwVar2.getOrDefault(locale, Collections.emptyList());
                List list2 = (List) llwVar.getOrDefault(locale, Collections.emptyList());
                if (list.size() == list2.size()) {
                    if (!list.containsAll(list2)) {
                    }
                }
            }
            return;
        }
        g.z();
    }
}
