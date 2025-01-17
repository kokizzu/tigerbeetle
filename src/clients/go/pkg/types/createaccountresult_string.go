// Code generated by "stringer -type=CreateAccountResult -trimprefix=Account"; DO NOT EDIT.

package types

import "strconv"

func _() {
	// An "invalid array index" compiler error signifies that the constant values have changed.
	// Re-run the stringer command to generate them again.
	var x [1]struct{}
	_ = x[AccountLinkedEventFailed-1]
	_ = x[AccountLinkedEventChainOpen-2]
	_ = x[AccountReservedFlag-3]
	_ = x[AccountReservedField-4]
	_ = x[AccountIdMustNotBeZero-5]
	_ = x[AccountIdMustNotBeIntMax-6]
	_ = x[AccountLedgerMustNotBeZero-7]
	_ = x[AccountCodeMustNotBeZero-8]
	_ = x[AccountDebitsPendingMustBeZero-9]
	_ = x[AccountDebitsPostedMustBeZero-10]
	_ = x[AccountCreditsPendingMustBeZero-11]
	_ = x[AccountCreditsPostedMustBeZero-12]
	_ = x[AccountMutuallyExclusiveFlags-13]
	_ = x[AccountExistsWithDifferentFlags-14]
	_ = x[AccountExistsWithDifferentUserData-15]
	_ = x[AccountExistsWithDifferentLedger-16]
	_ = x[AccountExistsWithDifferentCode-17]
	_ = x[AccountExists-18]
}

const _CreateAccountResult_name = "LinkedEventFailedLinkedEventChainOpenReservedFlagReservedFieldIdMustNotBeZeroIdMustNotBeIntMaxLedgerMustNotBeZeroCodeMustNotBeZeroDebitsPendingMustBeZeroDebitsPostedMustBeZeroCreditsPendingMustBeZeroCreditsPostedMustBeZeroMutuallyExclusiveFlagsExistsWithDifferentFlagsExistsWithDifferentUserDataExistsWithDifferentLedgerExistsWithDifferentCodeExists"

var _CreateAccountResult_index = [...]uint16{0, 17, 37, 49, 62, 77, 94, 113, 130, 153, 175, 199, 222, 244, 268, 295, 320, 343, 349}

func (i CreateAccountResult) String() string {
	i -= 1
	if i >= CreateAccountResult(len(_CreateAccountResult_index)-1) {
		return "CreateAccountResult(" + strconv.FormatInt(int64(i+1), 10) + ")"
	}
	return _CreateAccountResult_name[_CreateAccountResult_index[i]:_CreateAccountResult_index[i+1]]
}
