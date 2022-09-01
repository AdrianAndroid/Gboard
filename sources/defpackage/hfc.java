package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.lang.Character;

/* compiled from: PG */
/* renamed from: hfc  reason: default package */
/* loaded from: classes.dex */
public class hfc extends hfb {
    private static final KeyCharacterMap a = KeyCharacterMap.load(-1);

    @Override // defpackage.hfb, defpackage.hfi
    public hfd a(KeyEvent keyEvent) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(iaz.a(keyEvent) & Integer.MAX_VALUE);
        if (Character.UnicodeBlock.BASIC_LATIN.equals(of) || Character.UnicodeBlock.LATIN_1_SUPPLEMENT.equals(of) || Character.UnicodeBlock.LATIN_EXTENDED_A.equals(of) || Character.UnicodeBlock.LATIN_EXTENDED_B.equals(of) || Character.UnicodeBlock.IPA_EXTENSIONS.equals(of) || Character.UnicodeBlock.SPACING_MODIFIER_LETTERS.equals(of) || Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS.equals(of)) {
            return super.a(keyEvent);
        }
        return c(iax.DECODE, new String(Character.toChars(a.get(keyEvent.getKeyCode(), keyEvent.getMetaState()))), keyEvent);
    }
}
